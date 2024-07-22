import { Footer } from "@/components/footer";
import { Menu } from "@/components/menu";
import { FiltersData, Job, serverUrl } from "./types-and-constants";
import { JobCard } from "./job-card";
import { SearchFilters } from "./search-filters";
import { cache, FormEvent, useState } from "react";

async function getFiltersData() {
  const res = await fetch(`${serverUrl}/load`);
  
  return res.json();
}

// Utilizar funções setter para manipular jobsData sem usar estado
async function getJobsData(event : FormEvent<HTMLFormElement> | null) {
  "use server";

  if(event != null) {
    let formElements = event.currentTarget.elements;
    let checkedElements = [[],[],[]];

    for(let i = 0; i < formElements.length; i++) {
        let element = formElements[i];
        
        if(element.tagName == "INPUT" && element.checked == true) {
            switch(element.value[0]) {
                case "f":
                    checkedElements[0].push(element.value.split("faixa")[1]);
                    break;
                case "l":
                    checkedElements[1].push(element.value.split("local")[1]);
                    break;
                case "m":
                    checkedElements[2].push(element.value.split("modalidade")[1]);
                    break;
                default:
                    break;
            }
        }
    }

    const res = await fetch(`${serverUrl}/vagas/filtrar`, {
      method: "POST", 
      body: JSON.stringify({
      "faixasSalariais": checkedElements[0], 
      "estados": checkedElements[1],
      "modalidades": checkedElements[2]
    })});

    return res.json();

  }else {
    const res = await fetch(`${serverUrl}/vagas`, {cache: "no-cache"});
    return res.json();
  }
}

export default async function PesquisaPage() {
  const filtersData : FiltersData = await getFiltersData();
  const jobsData: Job[] = await getJobsData(null);

  return (
    <main className="space-y-16">
      <Menu />
      
      <div className="w-[940px] mx-auto">
        <div className="flex gap-10">          
          
          <SearchFilters data={filtersData} useFilter={getJobsData}/>

          <div className="flex flex-1 flex-col space-y-2">
            <span className="font-regular text-base">Resultado da Pesquisa : </span>

            <div className="space-y-16">
              {jobsData.length != 0 ? (
                jobsData.map((job) => {
                  return <JobCard data={job} />
                })
              ) : null
              }    
            </div>
          </div>
        </div>
      </div>

      <Footer />
    </main>
  );
}

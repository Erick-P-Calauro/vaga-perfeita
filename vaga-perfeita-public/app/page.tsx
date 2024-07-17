import { Footer } from "@/components/footer";
import { Menu } from "@/components/menu";
import { FiltersData, Job, serverUrl } from "./types-and-constants";
import { JobCard } from "./job-card";
import { SearchFilters } from "./search-filters";

async function getFiltersData() {
  const res = await fetch(`${serverUrl}/load`);
  
  return res.json();
}

async function getJobsData() {
  const res = await fetch(`${serverUrl}/vagas`, {cache: "no-cache"});

  return res.json();
}

export default async function PesquisaPage() {
  const filtersData : FiltersData = await getFiltersData();
  const jobsData : Job[] = await getJobsData();

  return (
    <main className="space-y-16">
      <Menu />
      
      <div className="w-[940px] mx-auto">
        <div className="flex gap-10">          
          
          <SearchFilters data={filtersData}/>

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

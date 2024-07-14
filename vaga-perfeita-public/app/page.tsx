import { Footer } from "@/components/footer";
import { JobCard } from "@/components/job-card";
import { Menu } from "@/components/menu";
import { SearchFilters } from "@/components/search-filters";
import { FiltersData, serverUrl } from "./types-and-constants";

async function getFiltersData() {
  const res = await fetch(`${serverUrl}/load`);
  
  return res.json();
} 

export default async function PesquisaPage() {
  const filtersData : FiltersData = await getFiltersData();

  return (
    <main className="space-y-16">
      <Menu />
      
      <div className="w-[940px] mx-auto">
        <div className="flex gap-10">          
          
          <SearchFilters data={filtersData}/>

          <div className="flex flex-1 flex-col space-y-2">
            <span className="font-regular text-base">Resultado da Pesquisa : </span>

            <div className="space-y-16">
              <JobCard />    
            </div>
          </div>
        </div>
      </div>

      <Footer />
    </main>
  );
}

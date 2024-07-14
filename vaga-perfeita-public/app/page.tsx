import { Footer } from "@/components/footer";
import { JobCard } from "@/components/job-card";
import { Menu } from "@/components/menu";
import { SearchFilters } from "@/components/search-filters";

export default function PesquisaPage() {
  return (
    <main className="space-y-16">
      <Menu />
      
      <div className="w-[940px] mx-auto">
        <div className="flex gap-10">          
          
          <SearchFilters />

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

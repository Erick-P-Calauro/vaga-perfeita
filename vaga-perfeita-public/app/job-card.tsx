import { Job } from "./types-and-constants";

interface JobCardProps {
    data: Job
}

export function JobCard({ data }: JobCardProps) {
    return (
        <div className="bg-blue-100 w-full px-8 py-5 space-y-5">
            <div className="flex items-center justify-between">
                <span className="text-sm">{data.nomeEmpresa}</span>
                <span className="text-sm">Há {data.tempoDecorrido} dias</span>
            </div>

            <div className="space-y-8">
                <div className="space-y-2">
                <span className="text-xl">{data.nomeVaga}</span>

                <div className="flex items-center space-x-32">
                    <span>R${data.salario} / Mês</span>
                    <div className="space-x-40">
                        <span>{data.modalidade.nome}</span>
                        <span>{data.cidade}</span>
                    </div>
                </div>
                </div>
                    
                <p className="text-base">
                    <strong className="pr-1"> Descrição : </strong>
                    {data.descricao}
                </p>
            </div>

            <div className="text-center">
                <a className="bg-blue-800 px-3 py-1.5 rounded-md text-white text-sm hover:bg-blue-700" href="#">Ver mais</a>
            </div>
        </div>
    )
}
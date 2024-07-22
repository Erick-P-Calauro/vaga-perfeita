'use client';

import { FiltersData } from "@/app/types-and-constants"
import { FormEvent, useState } from "react";
import { ChevronUp, ChevronDown } from 'lucide-react';

interface SearchFiltersProps {
    data: FiltersData
    useFilter: (event: FormEvent<HTMLFormElement>) => void
}

export function SearchFilters(props: SearchFiltersProps) {
    const [showLocalidades, setShowLocalidades] = useState(false);

    function openShowLocalidades() {
        setShowLocalidades(true);
    }

    function closeShowLocalidades() {
        setShowLocalidades(false);
    }

    return (
        <form onSubmit={props.useFilter} className="mt-8 space-y-16">
            <div className="space-y-2">
              <span className="text-lg font-bold">FAIXAS SALARIAIS</span>

              <div className="ml-5 space-y-2.5">
                {props.data.Faixas.map((faixa, index) => {
                    if(index == props.data.Faixas.length - 1) {
                        return (
                            <div key={"faixa"+faixa.id} className="flex items-center gap-5">
                                <input value={"faixa"+faixa.id} className="size-5" type="checkbox"/>
                                <span>Mais de R$10.000</span>
                            </div>
                        )
                    }
                    
                    return (
                        <div key={"faixa"+faixa.id} className="flex items-center gap-5">
                            <input value={"faixa"+faixa.id} className="size-5" type="checkbox"/>
                            <span>
                                R$ {faixa.menorValor.toString()[0] + "." + faixa.menorValor.toString().slice(1) + " "} 
                                até  
                                R$ {faixa.maiorValor.toString()[0] + "." + faixa.maiorValor.toString().slice(1)}
                            </span>
                        </div>
                    )
                })}
              </div>
            </div>
            
            <div className="space-y-2 truncate">
              <span className="text-lg font-bold">LOCALIDADES</span>

              <div className="ml-5 space-y-2.5">
                {showLocalidades == true ? (
                    props.data.Locais.map((local, index) => {
                        if(index == props.data.Locais.length - 1) {
                            return <button onClick={closeShowLocalidades} className="flex items-center gap-2 text-blue-500 hover:text-blue-400">
                                <span>Ver menos</span>
                                <ChevronUp className="size-4"/>
                            </button>
                        }
                        
                        return (
                            <div key={"local"+local.id} className="flex items-center gap-5">
                                <input value={"local"+local.id}  className="size-5" type="checkbox"/>
                                <span>{local.nome}</span>
                            </div>
                        )
                    })

                    
                ) : (
                    props.data.Locais.map((local, index) => {
                        if(index == 10) {
                            return <button key={index} onClick={openShowLocalidades} className="flex items-center gap-2 text-blue-500 hover:text-blue-400">
                                <span>Ver mais</span>
                                <ChevronDown className="size-4"/>
                            </button>

                        }else if(index < 10) {
                            return (
                                <div key={local.id} className="flex items-center gap-5">
                                    <input value={"local"+local.id} className="size-5" type="checkbox"/>
                                    <span>{local.nome}</span>
                                </div>
                            )
                        }
                    })
                )}
              </div>
            </div>
            
            <div className="space-y-2">
              <span className="text-lg font-bold">MODALIDADES</span>

              <div className="ml-5 space-y-2.5">
                {props.data.Modalidades.map((modalidade) => {
                    return (
                        <div key={"modalidade"+modalidade.id} className="flex items-center gap-5">
                            <input value={"modalidade"+modalidade.id} className="size-5" type="checkbox"/>
                            <span>{modalidade.nome}</span>
                        </div>
                    )
                })}
              </div>
            </div>

            <button className="bg-blue-800 text-white border outline-white px-3 py-1.5 rounded-md text-sm">Filtrar</button>
        </form>
    )
}
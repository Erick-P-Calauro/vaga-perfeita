export const serverUrl = "http://localhost:8080"

export interface FiltersData {
    Locais: Estado[],
    Faixas: FaixaSalarial[],
    Modalidades: Modalidade[]
}

export interface Job {
    id: string,
    nomeEmpresa: string,
    nomeVaga: string,
    salario: number,
    cidade: string,
    tempoDecorrido: number,
    descricao: string,
    modalidade: Modalidade
}

interface FaixaSalarial {
    id: string,
    menorValor: number,
    maiorValor: number,
}

interface Estado {
    id: string,
    nome: string
}

interface Modalidade {
    id: string,
    nome: string
}
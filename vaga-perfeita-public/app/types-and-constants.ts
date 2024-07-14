export const serverUrl = "http://localhost:8080"

export interface FiltersData {
    Locais: Estado[],
    Faixas: FaixaSalarial[],
    Modalidades: Modalidade[]
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
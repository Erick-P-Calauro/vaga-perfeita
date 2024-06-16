import { Faixa, Local, Modalidade } from "@/DTO/DTO-list";

export default function Home() {
  return buildHomePage();
}

async function carregarDados() : Promise<{Faixas: Array<Faixa>, Locais: Array<Local>, Modalidades: Array<Modalidade>}> {
  const response = await fetch("http://localhost:8080/carregar");

  return response.json();
}

async function buildHomePage() {
  "use server";

  const data = await carregarDados();

  const faixas = data.Faixas;
  const locais = data.Locais;
  const modalidades = data.Modalidades;
  
  return (
    <main>
      <h1>Hello World</h1>
      
      <h2>Faixas Salarias</h2>
      <div>
        {faixas.map((faixa : Faixa) => {
          return <div key={faixa.id}>{faixa.menorValor} - {faixa.maiorValor}</div>
        })}
      </div>
      
      <h2>Locais</h2>
      <div>
        {locais.map((local : Local) => {
          return <div key={local.id}>{local.nome}</div>
        })}
      </div>

      <h2>Modalidades</h2>
      <div>
        {modalidades.map((modalidade : Modalidade) => {
          return <div key={modalidade.id}>{modalidade.nome}</div>
        })}
      </div>
    </main>
  )
}

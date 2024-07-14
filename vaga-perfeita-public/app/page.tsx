export default function PesquisaPage() {
  return (
    <main className="space-y-16">
      <nav className="bg-blue-800 text-white h-[76px] flex items-center">
        <div className="w-[940px] mx-auto flex items-center justify-between">
          <h1 className="text-3xl font-normal">Vaga Perfeita</h1>

          <div className="flex items-center gap-5">
            <a className="border outline-white px-3 py-1.5 rounded-md text-sm hover:bg-blue-50 hover:text-blue-800" href="#">Perfil</a>
            <a className="border outline-white px-3 py-1.5 rounded-md text-sm hover:bg-blue-50 hover:text-blue-800" href="#">Nova Vaga</a>
          </div>
        </div>
      </nav>
      
      <div className="w-[940px] mx-auto">
        <div className="flex gap-10">          
          
          <div className="mt-8 space-y-16">
          <form className="space-y-2">
              <span className="text-lg font-bold">FAIXA SALARIAL</span>

              <div className="ml-5 space-y-2.5">
                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>
              </div>
            </form>

            <form className="space-y-2">
              <span className="text-lg font-bold">FAIXA SALARIAL</span>

              <div className="ml-5 space-y-2.5">
                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>
              </div>
            </form>

            <form className="space-y-2">
              <span className="text-lg font-bold">FAIXA SALARIAL</span>

              <div className="ml-5 space-y-2.5">
                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>

                <div className="flex items-center gap-5">
                  <input className="size-5" type="checkbox"/>
                  <span>R$1000 a R$2500</span>
                </div>
              </div>
            </form>
          </div>

          <div className="flex flex-1 flex-col space-y-2">
            <span className="font-regular text-base">Resultado da Pesquisa : </span>

            <div >
              <div className="bg-blue-100 w-full px-8 py-5 space-y-5">
                <div className="flex items-center justify-between">
                  <span className="text-sm">Google</span>
                  <span className="text-sm">Há 2 dias</span>
                </div>

                <div className="space-y-8">
                  <div className="space-y-2">
                    <span className="text-xl">Desenvolvedor Flutter Júnior</span>

                    <div className="flex items-center space-x-32">
                      <span className="text-sm">R$ 5.000 / Mês</span>
                      <div className="space-x-40">
                        <span className="text-sm">Home Office</span>
                        <span className="text-sm">Pato de Minas</span>
                      </div>
                    </div>
                  </div>

                  <p>
                    Lorem ipsum dolor sit amet, 
                    consectetur adipiscing elit. Donec eu tellus  felis. 
                    Nulla tempus, ex et consectetur consequat, dui risus tempus  massa, nec porttitor metus ipsum nec mauris. 
                    Aliquam erat volutpat. In  porttitor ligula ac consectetur pharetra. 
                    Vestibulum eget consequat  orci. Ut non nunc vel lacus luctus malesuada eu vitae sem. 
                    Cras odio  metus, pellentesque vel tempus quis, faucibus sit amet felis.
                  </p>
                </div>

                <div className="text-center">
                  <a className="bg-blue-800 px-3 py-1.5 rounded-md text-white text-sm hover:bg-blue-700" href="#">Ver mais</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <footer className="bg-blue-800">
        <div className="w-[940px] mx-auto py-9 text-white flex justify-between">
          <div className="flex flex-col justify-start space-y-2">
            <span>INSTITUCIONAL</span>
            <a href="#">Trabalhe conosco</a>
            <a href="#">Quem somos</a>
          </div>

          <div className="flex flex-col justify-start space-y-2">
            <span>EMPRESAS</span>
            <a href="#">Ferramentas</a>
            <a href="#">Blog</a>
          </div>

          <div className="flex flex-col justify-start space-y-2">
            <span>CANDIDATO</span>
            <a href="#">Segurança e Privacidade</a>
            <a href="#">Pesquisa de vagas</a>
            <a href="#">Como funciona</a>
            <a href="#">Ajuda</a>
          </div>

          <div className="flex flex-col justify-start space-y-2">
            <span>INSTITUCIONAL</span>
            <a href="#">Trabalhe conosco</a>
            <a href="#">Quem somos</a>
          </div>
        </div>
      </footer>
    </main>
  );
}

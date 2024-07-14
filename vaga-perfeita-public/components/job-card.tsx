export function JobCard() {
    return (
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
    )
}
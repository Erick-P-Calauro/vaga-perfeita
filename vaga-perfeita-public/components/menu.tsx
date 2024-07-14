export function Menu() {
    return (
        <nav className="bg-blue-800 text-white h-[76px] flex items-center">
            <div className="w-[940px] mx-auto flex items-center justify-between">
            <h1 className="text-3xl font-normal">Vaga Perfeita</h1>

            <div className="flex items-center gap-5">
                <a className="border outline-white px-3 py-1.5 rounded-md text-sm hover:bg-blue-50 hover:text-blue-800" href="#">Perfil</a>
                <a className="border outline-white px-3 py-1.5 rounded-md text-sm hover:bg-blue-50 hover:text-blue-800" href="#">Nova Vaga</a>
            </div>
            </div>
        </nav>
    )
}
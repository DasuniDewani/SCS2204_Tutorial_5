object ADD extends App{

    def addition(n:Int):Int = n match{
        case 0 => return 0
        case x => return  addition(x-1) + x
    }
    println(addition((3)))
}
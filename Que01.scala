object PrimeNo extends App{
    
    // GCD Greatest common divition

    def GCD (a:Int , b:Int):Int = b match{
        case 0 => a
        case x if x > a  => GCD(x,a)
        case x => GCD(x, a % x)
    }

    def Prime(p:Int , n:Int = 2):Boolean = n match{
        case x if (x==p) => true
        case x if GCD(p,x) > 1 => false
        case x => Prime(p , x+1)
    }

    println(Prime(5))
    println(Prime(8))

}
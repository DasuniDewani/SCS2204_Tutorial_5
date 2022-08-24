object fibonacci extends App{

    def Fibonacci(n:Int): Int = n match{
        case x if x == 0 => 0
        case x if x == 1 => 1
        case x => Fibonacci(n-1) + Fibonacci(n-2)
    }

    def FibonacciSeq(n:Int):Unit = {
        if(n > 0) FibonacciSeq(n-1)
        println(Fibonacci(n))
    }
    FibonacciSeq(10)

}
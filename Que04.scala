object  evenodd extends App{

    // Using Indirect Recursion

    def IsEven(n:Int):Boolean = n match{
        case 0 => true
        case x=> IsOdd(x-1)
    }

    def IsOdd(n:Int):Boolean =  !(IsEven(n))

    
    def Check(n:Int):Unit = {
        if(IsEven(n))
            println("Even")
        else 
            println("Odd")
    }

    Check(10)
} 
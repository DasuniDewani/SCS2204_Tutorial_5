object  evenOrodd extends App{

  def AddEven(n:Int):Int = n match {
        case 0 => return 0
        case x if(x % 2 == 0) => return x + AddEven(x - 1)
        case x if(x % 2 == 1) => AddEven(n - 1)
  }
     
  println(AddEven(10))
} 
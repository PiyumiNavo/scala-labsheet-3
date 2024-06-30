@main def main() = print(myFilterFunc(List("Hello", "World", "Scala", "Programming")))

//using filter function
def lengthLimited(stringArr:Array[String]):Array[String] = {
    stringArr.filter(_.length() <= 5)
}


def myFilterFunc(arr: List[String]): List[String] = {
    arr match {
        case Nil => Nil
        case head :: tail =>
            if (head.length > 5) head :: myFilterFunc(tail) 
            else myFilterFunc(tail)
    }
}



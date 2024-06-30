@main def main() = print(evenSum(List(1,2,3,4,5)))



def evenSum(list:List[Int]):Int = list match{
        case Nil => 0
        case head :: tail => 
            if (head % 2 == 0)  head + evenSum(tail)
            else evenSum(tail)
    }

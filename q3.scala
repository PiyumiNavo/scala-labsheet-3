import scala.math.BigDecimal.RoundingMode

@main def main() = print(avg2(4,5))


def avg1(num1:Int,num2:Int):Float = BigDecimal((num1.toFloat + num2.toFloat) / 2).setScale(2,RoundingMode.HALF_UP).toFloat

// def avg2(num1:Int,num2:Int):Float = "%.2f".format((num1.toFloat + num2.toFloat) / 2).toFloat
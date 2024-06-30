@main def main() = print(reverse("Hello"))


def reverse(word:String):String = 
    if (word.length == 1) word
    else word(word.length-1) + reverse(word.substring(0, word.length-1))


    
fun getnum():Int{
    var myresult:Int=readLine()!!.toInt()
    return myresult
}

fun main (args:Array<String>){

    val  name1:String="milad"
    val name2:String="ali"
    val name3:String="omid"
    print("first name is :$name1\n"+"second name is:$name2\n three name is: $name3\n enter your number:" )


    when(getnum()){
        1 ->{ print("milad is win")}
        2-> print("ali is win")
        3-> print("omid is win")
        else-> print("nothing")
    }
}



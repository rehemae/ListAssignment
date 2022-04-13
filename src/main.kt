fun main() {
    names(listOf("Anna","Amosi","Aba","Esta","Agi","Babu","Amon","Abia","Ummy","Tuma"))
    peoplesHeight(listOf(2.3,4.3,4.4,7.0))
    var name1=Person("rehema",23,4,50)
    var name2=Person("Anna",22,8,50)
    var name3=Person("Ayoub",33,6,56)
    var namee= listOf(name1,name2,name3,)
    println(namee.sortedByDescending { s->s.age })

    var a=Person("Amina",22,5,30)
    var b=Person("Bertha",27,8,50)
    var namees= listOf(a,b)
    println(namees.plus(namee))

    var vehicle1=information("rREN34JD",89)
    var vehicle2=information("ERY4",90)
    var vehicle3=information("AAA123TZ",90)
    var vehicle4=information("WEE12",76)
    var allvehicle= listOf(vehicle1,vehicle2,vehicle3,vehicle4)
    println(informations(allvehicle))



}
fun  names(name:List<String>):List<String> {
    name.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)
        }
    }
return name
}


fun peoplesHeight(height:List<Double>): String {
    var totalheight = height.sum()
    var avg = height.average()
    var totalHeight = "$totalheight, $avg"
    println(totalHeight)

return totalHeight
}


data class Person(var name:String, var age:Int, var height: Int, var weight:Int)

data class information(var registration:String, var mileage:Int)
fun informations(vehicle:List<information>):Int{
    var car=0
    vehicle.forEach { cars->cars.mileage
        car+=cars.mileage

    }
    var avarage=car/vehicle.count()
    return avarage
}









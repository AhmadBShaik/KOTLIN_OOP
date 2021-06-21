package polymorphism

fun main(){
    val jasmine = getPlantFlowerType(FloweringPlant())
    val horsetails = getPlantFlowerType(NonFloweringPlant())

    jasmine.type()
    horsetails.type()

}

fun getPlantFlowerType(plant: Plant) : Plant = plant
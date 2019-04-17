package P3

class Idee(nameIdeea : String) : MindObject {

    val name : String = nameIdeea
    private var children : MutableList<MindObject> = mutableListOf()

    override fun showContent(level: Int) {
        for(i in 0..level){
            print("\t")
        }
        print("$name\n")
        children.forEach{ it.showContent(level+1) }
    }

    override fun addChild(obj: MindObject) {
        children.add(obj)
    }

    override fun removeChild(obj: MindObject) {
        children.remove(obj)
    }
}
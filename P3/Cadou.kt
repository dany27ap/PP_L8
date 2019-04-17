package P3

class Cadou(nameGift : String) : MindObject {

    private val name = nameGift
    private val children : MutableList<MindObject> = mutableListOf()

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
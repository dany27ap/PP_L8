package P1

enum class Products{
    APA, WISKEY, BERE, VIN;

    override fun toString(): String {
        return super.toString().toLowerCase()
    }
}


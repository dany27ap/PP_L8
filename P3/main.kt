package P3

fun main(){
    val calatorie = Calatorie("Conferința RSA din San Francisco - SUA ")
        val activitateOne = Activitate("Activități din prima zi")
            val vizitaSF = Calatorie("Vizită în San Francisco")
            val vizitaA = Calatorie("Vizită la închisoarea Alcatraz")
        activitateOne.addChild(vizitaSF)
        activitateOne.addChild(vizitaA)

        val activitateTwo = Activitate("Activități din ziua prezentării")
            val prezentareLucrare = Activitate("Prezentarea lucrării")
            activitateTwo.addChild(prezentareLucrare)
                val eq = Idee("Evitare emoții 1")
                val corelareInfo = Idee("Corelare informații")
            prezentareLucrare.addChild(eq)
            prezentareLucrare.addChild(corelareInfo)
            val prezentareAtragatoare = Activitate("Prezentator care a atras atenția")
            activitateTwo.addChild(prezentareAtragatoare)
            val friendshipStrange = Prietenie("Doctor Strange -> autorul lucrării 'Ghost in the shell")
            activitateTwo.addChild(friendshipStrange)

        val activitateThree = Activitate("Activități din ultima zi")
            val friendshipEugene = Prietenie("Eugene Kaspersky -> unul din participanții la conferinta")
            val friendFabian = Prietenie("Fabian Wosar -> Leaderul echipei de ransomware decrypto-tools, de la Emsisoft")
            val vizitaTurn = Activitate("Tur nocturn în cartierul chinezesc")
        activitateThree.addChild(friendshipEugene)
        activitateThree.addChild(friendFabian)
        activitateThree.addChild(vizitaTurn)
                val magnetCadou = Cadou("Magnet pentru frigider, cu podul Golden Gate")
                val vedereInchisoare = Cadou("Vederi cu închisoarea Alcatraz")
        vizitaTurn.addChild(magnetCadou)
        vizitaTurn.addChild(vedereInchisoare)

    calatorie.addChild(activitateOne)
    calatorie.addChild(activitateTwo)
    calatorie.addChild(activitateThree)
    calatorie.showContent(0)
}
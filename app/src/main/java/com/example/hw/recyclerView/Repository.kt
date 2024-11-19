package com.example.hw.recyclerView

object Repository {

    fun getItemList(): List<MultipleHoldersData> = listOf(
        ButtonHolderData(
            id = "buttons",
            btn1 = "List",
            btn2 = "Grid"
        ),
        BasicHolderData(
            id = "1",
            imageUrl = "https://i.pinimg.com/736x/e3/db/71/e3db718a6dabef237745016c6be3a54b.jpg",
            title = "Madoka & Homura",
            description = "Puella Magi Madoka Magica (Japanese: 魔法少女まどか☆マギカ, Hepburn: Mahō Shōjo Madoka Magika), also known simply as Madoka Magica, is a Japanese anime television series created by Magica Quartet;[b] and animated by Shaft. The story follows a group of middle school girls, led by protagonist Madoka Kaname, who make supernatural contracts to become magical girls. In battling surreal enemies known as \"witches\", they learn of the anguish and peril associated with their new roles. The first ten episodes of the series aired on TBS and MBS between January and March 2011, while the final two episodes were delayed until April of the same year due to the Tōhoku earthquake and tsunami."
        ),
        BasicHolderData(
            id = "2",
            imageUrl = "https://i.pinimg.com/736x/ab/67/cc/ab67ccf27192f623991956c600642a20.jpg",
            title = "Goat",
            description = "The goat or domestic goat (Capra hircus) is a species of goat-antelope that is mostly kept as livestock. It was domesticated from the wild goat (C. aegagrus) of Southwest Asia and Eastern Europe. The goat is a member of the family Bovidae, meaning it is closely related to the sheep. It was one of the first animals to be domesticated, in Iran around 10,000 years ago."
        ),
        BasicHolderData(
            id = "3",
            imageUrl = "https://i.pinimg.com/736x/60/b2/6b/60b26b21301e68ab23e7983154f93bdb.jpg",
            title = "Angel devil",
            description = "Angel (エンジェル Enjeru?) is the Angel Devil (天てん使しの悪あく魔ま Tenshi no Akuma?), a devil who embodies the fear of angels, and a Public Safety Devil Hunter from Tokyo Special Division 4. He serves as a supporting character in the Public Safety Saga."
        ),
        BasicHolderData(
            id = "4",
            imageUrl = "https://i.pinimg.com/736x/68/f5/4f/68f54f3b37dc3ab25b9dac5ed2d48769.jpg",
            title = "Anya",
            description = "Anya is the nurse of the crew on the Tulpar spaceship. She's in charge of the medical supplies of the ship, conducting the other crew mates psych evaluations and assisting them with medical care."
        ),
        BasicHolderData(
            id = "5",
            imageUrl = "https://i.pinimg.com/736x/d0/d7/79/d0d77983ee4fb3aa051c22cfe756223e.jpg",
            title = "Daisuke",
            description = "Daisuke (ダイスケ) is an intern on the Tulpar space freighter under the supervision of the ship's mechanic, Swansea."
        ),
        BasicHolderData(
            id = "6",
            imageUrl = "https://i.pinimg.com/736x/03/4b/ad/034bad19271e536ee6ddc818dae30598.jpg",
            title = "Weapons",
            description = "The Weapon Devils (武ぶ器きの悪あく魔ま Buki no Akuma?) were a group of 7 Devils that previously served under the Four Horsemen[1], each member embodies the fear of a certain type of weapon. All Weapon Devils are now currently fused with a human."
        ),
        BasicHolderData(
            id = "7",
            imageUrl = "https://i.pinimg.com/736x/11/d9/22/11d92290bd92f6719e687f86a734db3d.jpg",
            title = "Leon & Cats",
            description = "Leon Scott Kennedy (Japanese: レオン・スコット・ケネディ, Hepburn: Reon Sukotto Kenedi) is a character in the Resident Evil survival horror video game series created by the Japanese company Capcom. He was introduced as one of the two player characters in the video game Resident Evil 2 (1998), alongside Claire Redfield. During the events of Resident Evil 2, Leon is a rookie police officer who arrives in the doomed Raccoon City late for his first day on the job and is confronted by a zombie outbreak."
        ),
        BasicHolderData(
            id = "8",
            imageUrl = "https://i.pinimg.com/736x/f9/f7/70/f9f7704769f0fee1df92d216c06aa994.jpg",
            title = "Bennet & Florance",
            description = "Hello Charlotte is an RPG Maker game series made by etherane, an artist and game developer from Estonia. It's about a girl named Charlotte Wiltshire and her life in The House, with her friends, and at school! There are 5 titles, but only 3 of them make up the main storyline."
        ),
        BasicHolderData(
            id = "9",
            imageUrl = "https://i.pinimg.com/736x/41/36/3d/41363dc3ccc07446262f18eb9603750c.jpg",
            title = "Cute fox",
            description = "Foxes are small-to-medium-sized omnivorous mammals belonging to several genera of the family Canidae. They have a flattened skull; upright, triangular ears; a pointed, slightly upturned snout; and a long, bushy tail (\"brush\")."
        ),
        BasicHolderData(
            id = "10",
            imageUrl = "https://i.pinimg.com/736x/66/54/b3/6654b306b7daf88df904a3df8b6ae789.jpg",
            title = "Deer with wings",
            description = "A deer (pl.: deer) or true deer is a hoofed ruminant ungulate of the family Cervidae (informally the deer family). Cervidae is divided into subfamilies Cervinae (which includes, among others, muntjac, elk (wapiti), red deer, and fallow deer) and Capreolinae (which includes, among others reindeer (caribou), white-tailed deer, roe deer, and moose). "
        ),
        BasicHolderData(
            id = "11",
            imageUrl = "https://i.pinimg.com/736x/44/d8/86/44d886f1f0696f8fb0209ede04ce48b9.jpg",
            title = "Two-head rat",
            description = "Rats are various medium-sized, long-tailed rodents. Species of rats are found throughout the order Rodentia, but stereotypical rats are found in the genus Rattus. Other rat genera include Neotoma (pack rats), Bandicota (bandicoot rats) and Dipodomys (kangaroo rats)."
        ),
        BasicHolderData(
            id = "12",
            imageUrl = "https://i.pinimg.com/736x/c7/84/bd/c784bdd3c0b7be586529fd55e65a71c0.jpg",
            title = "Fish cup",
            description = "Cup designed with passion and love to fish. Probably high in price."
        ),
        BasicHolderData(
            id = "13",
            imageUrl = "https://i.pinimg.com/736x/82/bd/bb/82bdbbe40d0d2367ca99c2f8348e9e77.jpg",
            title = "Pochita",
            description = "The Chainsaw Devil, who merges with Denji and was the original Chainsaw Man prior to meeting him. He has the ability to eat a devil and erase their existence, making him \"the Devil that Devils fear most\". He first appears in his dog form, which is actually a weakened state after a fight with unknown opponents. His true devil form is a darker version of Denji's hybrid form with four arms and one of his intestines wrapped around his neck, which resembles a scarf."
        ),
        BasicHolderData(
            id = "14",
            imageUrl = "https://i.pinimg.com/736x/6e/c0/82/6ec082574fd50a5c0ad112e91aae7ba7.jpg",
            title = "Panda",
            description = "The giant panda (Ailuropoda melanoleuca), also known as the panda bear or simply panda, is a bear species endemic to China. It is characterised by its white coat with black patches around the eyes, ears, legs and shoulders. Its body is rotund; adult individuals weigh 100 to 115 kg (220 to 254 lb) and are typically 1.2 to 1.9 m (3 ft 11 in to 6 ft 3 in) long. It is sexually dimorphic, with males being typically 10 to 20% larger than females. "
        ),
        BasicHolderData(
            id = "15",
            imageUrl = "https://i.pinimg.com/736x/40/22/30/402230a752edf2a02523bf6541f8669b.jpg",
            title = "Otter cup",
            description = "Cup designed with passion and love to otters. Probably high in price."
        ),
        BasicHolderData(
            id = "16",
            imageUrl = "https://i.pinimg.com/736x/27/4a/68/274a687dec2b6ffc962f8d1af0142a7b.jpg",
            title = "Meme",
            description = "Danya Kashin is having hard times being ginger-head."
        )
    )

    fun getRandomTitle(): String {
        val titles: List<String> = listOf(
            "Cool thing",
            "It's water",
            "Kolobok",
            "Fox",
            "Neurotic",
            "Window",
            "Widow",
            "Glasses",
            "Swansea",
            "Curly",
            "Pyramid",
            "Silent hill",
            "Harry"
        )
        return titles[titles.indices.random()]
    }

    fun getRandomDesc(): String {
        val descs: List<String> = listOf(
            "Very very cool thing",
            "The only thing better than a cold glass of water? Two cold glasses of water.",
            "Non-linear horror visual novel. Those, who have heard the voice of the forest, are beyond help.",
            "The \"Perpetual Testing Initiative\" has been expanded to allow you to design co-op puzzles for you and your friends!"
        )
        return descs[descs.indices.random()]
    }

    fun getRandomImage(): String {
        val imageUrl: List<String> = listOf(
            "https://i.pinimg.com/736x/8c/6c/c6/8c6cc6e0e34998fc8999dcf92251e403.jpg",
            "https://i.pinimg.com/736x/6f/06/17/6f061788753c9d3aa784b7b372f105db.jpg",
            "https://i.pinimg.com/736x/21/c1/bd/21c1bdca0818b45a997c431604a5f10e.jpg",
            "https://i.pinimg.com/736x/49/fd/93/49fd932872bf793ceb884e03fc280bea.jpg",
            "https://i.pinimg.com/736x/32/ee/7d/32ee7d04c5d8df5ec7868e0d48b44167.jpg",
            "https://i.pinimg.com/736x/09/ef/d9/09efd936daca34a9d19e0cc8c558f03f.jpg",
            "https://i.pinimg.com/736x/56/31/ad/5631ade40e5b7bff4071fb3b7fbda54e.jpg",
            "https://i.pinimg.com/736x/1f/e8/59/1fe8598490994ae9487c9608d12eb764.jpg",
            "https://i.pinimg.com/736x/a2/2f/22/a22f2207a29d3846d113179cc611d10f.jpg",
            "https://i.pinimg.com/736x/39/09/99/390999ba77f69ae46d07a2cac432961f.jpg",
            "https://i.pinimg.com/736x/7d/1a/1d/7d1a1de86ce2654ce1e075dbbcbc099b.jpg",
            "https://i.pinimg.com/736x/f0/e8/ca/f0e8caa7ee197c430e666fdaa99ad195.jpg",
            "https://i.pinimg.com/736x/f6/1d/5b/f61d5b06230e57ca4b6dbcf2e29d49cb.jpg"
        )
        return imageUrl[imageUrl.indices.random()]
    }
}
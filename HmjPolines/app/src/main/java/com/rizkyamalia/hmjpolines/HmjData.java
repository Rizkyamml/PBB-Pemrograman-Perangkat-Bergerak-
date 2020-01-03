package com.rizkyamalia.hmjpolines;

import java.util.ArrayList;

public class HmjData {
    public static String[][] data = new String[][]{
            {"0", "Love Rosie ", "A comedy romantic film about two best friends trapped and have to face their love story that accidentally grew", "https://i.postimg.cc/cCMQWDyq/love-rosie-2015-movie-poster-by-blantonl98-d8gtc68-fullview.jpg"},
            {"1", "13 Reasons Why ", "A mystery drama series about revolves around a high school student, Clay Jensen and another student, who committed suicide after experiencing a series of intimidation situations by several people at her school", "https://i.postimg.cc/JnHCCSPw/why.jpg"},
            {"2", "Escape Plan ", "An prison action thriller film about two important figures must successfully escape from prison that has strict supervision", "https://i.postimg.cc/jS31qZWR/escape-plan.jpg"},
            {"3", "The Hunger Games", "A science fiction-adventure film about Catching Fire still tells the story of the battle of life and death competition followed by 12 districts of the Panem State", "https://i.postimg.cc/52K5Ttyt/hunger-games.jpg"},
            {"4", "Ocean's 8 ", "A heist comedy film about a group of women led by Debbie Ocean, who plan a sophisticated heist of the annual Met Gala at the Metropolitan Museum of Art in New York City", "https://i.postimg.cc/RFdZpWCs/Oceans-88.jpg"},
            {"5", "Avengers End Game", "A superhero film about Continuation of the avenger member battle against Thanos, who was previously in infinity war, and  this time reached the breaking point", "https://i.postimg.cc/kXsJs3Hw/avengers.jpg"},
            {"6", "Divergent ", "A science fiction action film about adult humans who are divided into five types according to their respective characteristics. Divergent is a type that is not included in the five types because it has a wide variety of personality types that stand out in themselves", "https://i.postimg.cc/mD7RF0MY/divergent.jpg"},
            {"7", "Now You See Me ", "A crime fiction film that tells about the journey of four magicians who were given a mission by a mysterious", "https://i.postimg.cc/sgGLX55S/now-you-see-me.jpg"},

    };

    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] hmjData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(hmjData[0]));
            hmj.setName(hmjData[1]);
            hmj.setDescription(hmjData[2]);
            hmj.setPhoto(hmjData[3]);

            list.add(hmj);
        }
        return list;
    }
}

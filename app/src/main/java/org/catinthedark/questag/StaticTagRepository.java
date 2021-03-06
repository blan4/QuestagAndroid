package org.catinthedark.questag;

import java.util.ArrayList;
import java.util.Collection;

public class StaticTagRepository implements TagRepository {
    final static String[] tags = new String[] {
        "pomodoro",
        "birthday",
        "twins",
        "hospital",
        "sport",
        "pet",
        "duckface",
        "rainbow",
        "tatoo",
        "car",
        "champion",
        "makeup",
        "best_friends",
        "snowman",
        "pigeon",
        "beard",
        "sunglasses",
        "pool",
        "piano",
        "butterfly",
        "internet_explorer",
        "river",
        "pigeoff",
        "steampunk",
        "bike",
        "military",
        "graffiti",
        "starwars",
        "delorean",
        "dwarffortress",
        "punkisnotdead",
        "cookies",
        "retrofuturism",
        "thecakeisalie",
        "selfie",
        "minimalism_world",
        "explorerussia",
        "latte",
        "marshmellow",
        "cupcake",
        "macarons",
        "dog",
        "cat",
        "nya",
        "flowers",
        "siberia",
        "trains",
        "rails",
        "eiffeltower",
        "christmastree",
        "sea",
        "sand",
        "sunset",
        "pine",
        "purikura",
        "swing",
        "mlp",
        "rainbowdash",
        "coffee",
        "gate",
        "bamboo",
        "forest",
        "wall",
        "architecture",
        "sun",
        "ps4",
        "minecraft",
        "cake",
        "chocolate",
        "autumn",
        "volcano",
        "lavalamp",
        "buildings",
        "sculpture",
        "ketchup",
        "pepper",
        "bacon",
        "fireworks",
        "sparkler",
        "city",
        "sky",
        "kavai",
        "kitten",
        "ocean",
        "russia"};

    @Override
    public TagCollection getTagCollection() {
        Collection<Tag> tagCollection = new ArrayList<>(10);
        for (String tag: tags) {
            tagCollection.add(new Tag(tag));
        }

        return new TagCollection(tagCollection);
    }
}

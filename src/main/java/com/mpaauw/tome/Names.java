package com.mpaauw.tome;

public class Names {

    private final Tome tome;

    protected Names(Tome tome) {
        this.tome = tome;
    }

    public String animal() {
        return animals[ContentSeed.getRandomIndex(animals.length)];
    }

    public String scientist() {
        return scientists[ContentSeed.getRandomIndex(scientists.length)];
    }

    private final String[] animals = new String[]{
            "frog",
            "frogspawn",
            "newt",
            "tadpole",
            "toad",
            "scorpion",
            "spider",
            "tarantula",
            "albatross",
            "biddy",
            "blackbird",
            "canary",
            "crow",
            "cuckoo",
            "dove,",
            "pigeon",
            "duck",
            "eagle",
            "falcon",
            "finch",
            "flamingo",
            "goose",
            "gull",
            "hawk",
            "jackdaw",
            "jay",
            "kestrel",
            "kookaburra",
            "mallard",
            "nightingale",
            "nuthatch",
            "ostrich",
            "owl",
            "parakeet",
            "parrot",
            "peacock",
            "pelican",
            "penguin",
            "pheasant",
            "piranha",
            "raven",
            "robin",
            "rooster",
            "sparrow",
            "stork",
            "swallow",
            "swan",
            "swift",
            "tit",
            "turkey",
            "vulture",
            "woodpecker",
            "wren",
            "peacock-butterfly",
            "red-admiral",
            "silkworm",
            "swallowtail",
            "barbel",
            "carp",
            "cod",
            "crab",
            "eel",
            "goldfish",
            "haddock",
            "halibut",
            "jellyfish",
            "lobster",
            "perch",
            "pike",
            "plaice",
            "ray",
            "salmon",
            "sawfish",
            "scallop",
            "shark",
            "shell",
            "shrimp",
            "trout",
            "ant",
            "aphid",
            "bee",
            "beetle",
            "bumblebee",
            "caterpillar",
            "cockroach",
            "dragonfly",
            "flea",
            "fly",
            "gadfly",
            "grasshopper",
            "harvestman",
            "ladybug",
            "larva",
            "louse",
            "maggot",
            "midge",
            "millipede",
            "moth",
            "nymph",
            "wasp",
            "anteater",
            "antelope",
            "armadillo",
            "badger",
            "bat",
            "bear",
            "beaver",
            "bullock",
            "camel",
            "chimpanzee",
            "dachshund",
            "deer, hart",
            "dolphin",
            "elephant",
            "elk",
            "moose",
            "fox",
            "gazelle",
            "gerbil",
            "giraffe",
            "goat",
            "grizzly-bear",
            "guinea-pig",
            "hamster",
            "hare",
            "hedgehog",
            "horse",
            "hyena",
            "lion",
            "llama",
            "lynx",
            "mammoth",
            "marmot",
            "mink",
            "mole",
            "mongoose",
            "mouse",
            "mule",
            "otter",
            "panda",
            "pig, hog",
            "platypus",
            "polar-bear",
            "polecat",
            "pony",
            "porcupine",
            "prairie-dog",
            "puma",
            "racoon",
            "rat",
            "reindeer",
            "rhinoceros",
            "seal",
            "seal",
            "sheep",
            "skunk",
            "sloth",
            "squirrel",
            "tiger",
            "weasel",
            "whale",
            "wolf",
            "zebra",
            "slug",
            "snail",
            "blindworm",
            "boa",
            "chameleon",
            "constrictor-snake",
            "copperhead",
            "coral-snake",
            "cottonmouth",
            "crocodile",
            "diamondback-rattlesnake",
            "gecko",
            "iguana",
            "lizard",
            "python",
            "salamander",
            "saurian",
            "sea-snake",
            "sidewinder",
            "snake",
            "tortoise",
            "turtle",
            "tapeworm",
            "leech",
            "earthworm",
            "round-worm"};

    private final String[] scientists = new String[]{
            "agassiz",
            "agnesi",
            "al-battani",
            "al-farabi",
            "alhazen",
            "al-khalili",
            "al-khwarizmi",
            "alas",
            "alcala",
            "ali",
            "alvarez",
            "ampère",
            "anaximander",
            "anderson",
            "anning",
            "apgar",
            "archimedes",
            "arber",
            "aristarchus",
            "aristotle",
            "arrhenius",
            "avery",
            "avogadro",
            "avicenna",
            "babbage",
            "bacon",
            "bain",
            "baird",
            "banks",
            "barba",
            "bardeen",
            "barkla",
            "battuta",
            "bayliss",
            "beadle",
            "beckman",
            "becquerel",
            "behring",
            "bell",
            "berliner",
            "bernard",
            "berners-lee",
            "bernoulli",
            "berzelius",
            "bessemer",
            "bethe",
            "bhabha",
            "binet",
            "birdseye",
            "birkeland",
            "black",
            "blackwell",
            "blalock",
            "blodgett",
            "boas",
            "bohm",
            "bohr",
            "boltzmann",
            "born",
            "bosch",
            "bose",
            "bothe",
            "boyle",
            "bragg",
            "brahe",
            "brahmagupta",
            "brand",
            "brandt",
            "braun",
            "bretz",
            "broglie",
            "brongniart",
            "brown",
            "buchner",
            "buck",
            "buckland",
            "buffon",
            "bunsen",
            "burbank",
            "burnell",
            "burnet",
            "cabrera",
            "cajal",
            "carson",
            "carver",
            "cavendish",
            "celsius",
            "chadwick",
            "chandrasekhar",
            "chargaff",
            "chomsky",
            "chu",
            "clark",
            "cockcroft",
            "compton",
            "copernicus",
            "cori",
            "coulomb",
            "cousteau",
            "cox",
            "crick",
            "croll",
            "culpeper",
            "curie",
            "cuvier",
            "czerny",
            "daimler",
            "dalton",
            "dana",
            "darwin",
            "davy",
            "debye",
            "delbruck",
            "deluc",
            "democritus",
            "descartes",
            "diesel",
            "diophantus",
            "dirac",
            "divis",
            "dobzhansky",
            "drake",
            "drexler",
            "eccles",
            "eddington",
            "edison",
            "ehrlich",
            "einstein",
            "elion",
            "empedocles",
            "eratosthenes",
            "euclid",
            "cnidus",
            "euler",
            "faraday",
            "fermat",
            "fermi",
            "feynman",
            "pisa",
            "fischer",
            "fisher",
            "fleming",
            "florey",
            "ford",
            "forest",
            "fossey",
            "foucault",
            "franklin",
            "freud",
            "friedman",
            "galen",
            "galilei",
            "galton",
            "galvani",
            "gamow",
            "gardner",
            "gauss",
            "gell-mann",
            "germain",
            "gibbs",
            "gilbert",
            "glashow",
            "goddard",
            "goeppert-mayer",
            "gold",
            "goodall",
            "gould",
            "guericke",
            "haber",
            "haeckel",
            "hahn",
            "haller",
            "halley",
            "hardy",
            "harriot",
            "harvey",
            "hawking",
            "haxel",
            "heisenberg",
            "helmholtz",
            "helmont",
            "henry",
            "herschel",
            "hertz",
            "herzfeld",
            "hevesy",
            "hewish",
            "hilbert",
            "hilleman",
            "hipparchus",
            "hippocrates",
            "hirase",
            "hodgkin",
            "hooke",
            "hopkins",
            "hopper",
            "hornby",
            "horner",
            "houssay",
            "hoyle",
            "hubble",
            "humboldt",
            "hurston",
            "hutton",
            "huygens",
            "hypatia",
            "illy",
            "ising",
            "ito",
            "jemison",
            "jenner",
            "jensen",
            "joliot-curie",
            "joule",
            "julian",
            "kaku",
            "kapitsa",
            "kekulé",
            "kelsey",
            "kendrick",
            "kepler",
            "khan",
            "khayyam",
            "kinsey",
            "kirchoff",
            "klaproth",
            "koch",
            "kraepelin",
            "kuhn",
            "kwolek",
            "lagrange",
            "lamarck",
            "lamarr",
            "land",
            "landsteiner",
            "laplace",
            "laue",
            "lavoisier",
            "lawrence",
            "leavitt",
            "leeuwenhoek",
            "lehmann",
            "leibniz",
            "lemaître",
            "vinci",
            "leoniceno",
            "leopold",
            "levi-montalcini",
            "levi-strauss",
            "libby",
            "liebig",
            "linnaeus",
            "lister",
            "locke",
            "lorentz",
            "lorenz",
            "lovelace",
            "lowell",
            "lucretius",
            "lyell",
            "lysenko",
            "mach",
            "malpighi",
            "marcet",
            "marconi",
            "margulis",
            "matzinger",
            "maury",
            "maxwell",
            "mayr",
            "mcclintock",
            "meitner",
            "mendel",
            "mendeleev",
            "mesmer",
            "meucci",
            "michell",
            "michelson",
            "milanković",
            "mitchell",
            "molina",
            "morgan",
            "morse",
            "moseley",
            "nakaya",
            "napier",
            "natta",
            "needham",
            "neumann",
            "newcomen",
            "newton",
            "nicolle",
            "nightingale",
            "noakes",
            "nobel",
            "noether",
            "nusslein-volhard",
            "nye",
            "oersted",
            "ohm",
            "oppenheimer",
            "ostwald",
            "oughtred",
            "pascal",
            "pasteur",
            "pauli",
            "pauling",
            "pausch",
            "pavlov",
            "payne-gaposchkin",
            "penfield",
            "perey",
            "perkin",
            "philoponus",
            "piaget",
            "pinel",
            "planck",
            "elder",
            "poincaré",
            "popper",
            "potter",
            "priestley",
            "proclus",
            "ptolemy",
            "pythagoras",
            "quetelet",
            "quimby",
            "qurra",
            "raman",
            "ramanujan",
            "ramsay",
            "ray",
            "redi",
            "ride",
            "riemann",
            "röntgen",
            "rorschach",
            "ross",
            "rushd",
            "rutherford",
            "sagan",
            "salam",
            "salk",
            "sanger",
            "santos-dumont",
            "schottky",
            "schrödinger",
            "schwann",
            "seaborg",
            "selye",
            "sherrington",
            "shoemaker",
            "siemens",
            "simpson",
            "skinner",
            "smith",
            "soddy",
            "somerville",
            "sommerfeld",
            "staudinger",
            "steno",
            "stevens",
            "swainson",
            "szilard",
            "tartaglia",
            "teller",
            "tesla",
            "miletus",
            "alexandria",
            "thompson",
            "thomson",
            "thoreau",
            "thorne",
            "tombaugh",
            "tonegawa",
            "torricelli",
            "townes",
            "tu",
            "turing",
            "tyson",
            "urey",
            "venter",
            "vernadsky",
            "vesalius",
            "virchow",
            "virtanen",
            "volta",
            "waksman",
            "wald",
            "wallace",
            "wallis",
            "walton",
            "watson",
            "watt",
            "wegener",
            "wheeler",
            "wilkins",
            "willis",
            "wilson",
            "wingqvist",
            "winogradsky",
            "woese",
            "wöhler",
            "wright",
            "wundt",
            "yang",
            "zewail"};
}

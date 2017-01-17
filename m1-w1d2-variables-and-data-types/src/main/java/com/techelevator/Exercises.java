package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		int birdsOnBranch = 4;
		int birdsFlewAway = 1;
		int birdsLeft = birdsOnBranch - birdsFlewAway;
		System.out.println("Birds left: " + birdsLeft);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		int birds = 6;
		int nests = 3;
		int birdsWithoutNests = birds - nests;
		System.out.println("Birds without nests: " + birdsWithoutNests);

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		int raccoonsInWoods = 3;
		int raccoonsGoHome = 2;
		int raccoonsRemaining = raccoonsInWoods - raccoonsGoHome;
		System.out.println("The number of raccoons remaining is: " + raccoonsRemaining);

        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int flowers = 5;
		int bees = 3;
		int fewerBeesThanFlowers = flowers - bees;
		System.out.println("There are " + fewerBeesThanFlowers + " fewer bees than flowers.");

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int pigeonsAtStart = 1;
		int pigeonsAdded = 1;
		int pigeonsEating = pigeonsAtStart + pigeonsAdded;
		System.out.println("Total of piegons eating is: " + pigeonsEating);

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int owlsOnFence = 3;
		int owlsAdded = 2;
		int totalOwlsOnFence= owlsOnFence + owlsAdded;
		System.out.println("Total of owls on fence: " + totalOwlsOnFence);

        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int beaversWorking = 2;
		int beaversDeparting = 1;
		int beaversRemaining = beaversWorking - beaversDeparting;
		System.out.println("Total of beavers still working: " + beaversRemaining);

        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
		int toucansOnLimb = 2;
		int toucansJoining = 1;
		int totalToucans = toucansOnLimb + toucansJoining;
		System.out.println("Total of toucans: " + totalToucans);

        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int squirrels = 4;
		int nuts = 2;
		int squirrelsWithoutNuts = squirrels - nuts;
		System.out.println("Squirrels without nuts: " + squirrelsWithoutNuts);

        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		int quartersFound = 1;
		int dimesFound = 1;
		int nickelsFound = 2;
		
		float valueInQuarters = quartersFound * 0.25f;
		float valueInDimes = dimesFound * 0.10f;
		float valueInNickels = nickelsFound * 0.05f;
		
		float totalMoneyFound = valueInQuarters + valueInDimes + valueInNickels;
		System.out.println("Mrs. Hilt found a total of: $" + totalMoneyFound);

        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int brierMuffins = 18;
		int macadamsMuffins = 20;
		int flanneryMuffins = 17;
		int totalMuffins = brierMuffins + macadamsMuffins + flanneryMuffins;
		System.out.println("Total muffins: " + totalMuffins);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		float yoyoCost = 0.24f;
		float whistleCost = 0.14f;
		float totalCost = yoyoCost + whistleCost;
		System.out.println("Total cost: $" + totalCost);
        
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows =10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println("Total marshmallows: " + totalMarshmallows);
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHiltHouse = 29;
		int snowAtBrecknockSchool = 17;
		int moreSnowAtHiltHouse = snowAtHiltHouse - snowAtBrecknockSchool;
		System.out.println("How much more snow at the Hilt house: " +moreSnowAtHiltHouse + " inches");
        
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int funds = 10;
		int costTruck = 3;
		int costPencilCase = 2;
		int fundsRemaining = funds - costTruck - costPencilCase;
		System.out.println("Mrs.Hilt has: $" + fundsRemaining);
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marbles = 16;
		int marblesLost = 7;
		int marblesLeft = marbles - marblesLost;
		System.out.println("Marbles remanining: " + marblesLeft);
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int seashells = 19;
        int seashellCollection = 25;
        int seashellsNeeded = seashellCollection - seashells;
        System.out.println("Megan needs " + seashellsNeeded + " seashells");
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int redBalloons = 8;
        int totalBalloons = 17;
        int greenBalloons = totalBalloons - redBalloons;
        System.out.println("Green balloons: " + greenBalloons);
            
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksOnShelf = 38;
        int booksAdded = 10;
        int totalBooks = booksOnShelf + booksAdded;
        System.out.println("Total books: " + totalBooks);
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int legsPerBee = 6;
        int numberOfBees = 8;
        int totalBeeLegs = legsPerBee * numberOfBees;
        System.out.println("Total number of legs: " + totalBeeLegs);
        
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        float iceCreamPrice = 0.99f;
        int numberOfCones = 2;
        float totalPrice = numberOfCones * iceCreamPrice;
        System.out.println("Total cost: $" + totalPrice);
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int completeBorder = 125;
        int rocks = 64;
        int rocksNeeded = completeBorder - rocks;
        System.out.println("Number of rocks needed for border: " + rocksNeeded);
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int hiltMarbles = 38;
        int lostMarbles = 15;
        int remainingMarbles = hiltMarbles - lostMarbles;
        System.out.println("Mrs. Hilt's remaning marbles: " + remainingMarbles);
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int milesDriven = 32;
        int totalMiles = 78;
        int milesLeft = totalMiles - milesDriven;
        System.out.println("Miles left to venue: " + milesLeft);
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int shovelingMinsMorning = 90;
        int shovelingMinsAfternoon = 45;
        int totalShovelingTime = shovelingMinsAfternoon + shovelingMinsMorning;
        System.out.println("Total time shoveling: " + totalShovelingTime + " minutes");
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int hotdogs = 6;
        float hotdogCost = 0.50f;
        float totalHotdogCost = hotdogs * hotdogCost;
        System.out.println("Total cost of hotdogs: $" + totalHotdogCost);
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int hiltMoney = 50;
        int pencilCost = 7;
        int numberOfPencils = hiltMoney / pencilCost;
        System.out.println("Pencils afforded: " + numberOfPencils);
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int butterflies = 33;
        int orangeButterflies = 20;
        int redButterflies = butterflies - orangeButterflies;
        System.out.println("Red butterflies: " + redButterflies);
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double amountPaid = 1.00;
        double candyCost = 0.54;
        double changeDue = amountPaid - candyCost;
        System.out.println("Amount of change due: " + changeDue); 
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int trees = 13;
        int treesPlanted = 12;
        int totalTrees = trees + treesPlanted;
        System.out.println("Total trees: " + totalTrees);
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int days = 2;
        int hoursPerDay = 24;
        int totalHoursRemaining = hoursPerDay * days;
        System.out.println("Hours until Joy sees her grandma: " + totalHoursRemaining);
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int cousins = 4;
        int gumPerCousin = 5;
        int totalGum = gumPerCousin * cousins;
        System.out.println("Total gum needed: " + totalGum);
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        float dansMoney = 3.00f;
        float candyBarCost = 1.00f;
        float dansMoneyLeft = dansMoney - candyBarCost;
        System.out.println("Money Dan has left: $" + dansMoneyLeft);
        
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boats = 5;
        int peopleInBoats = 3;
        int totalPeopleInBoats = boats * peopleInBoats;
        System.out.println("Total people in boats: " + totalPeopleInBoats);
        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int legos = 380;
        int legosLost = 57;
        int legosRemaining = legos - legosLost;
        System.out.println("Remaining legos: " + legosRemaining);
            
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int muffinsTotal = 83;
        int muffinsBaked = 35;
        int muffinsNeeded = muffinsTotal - muffinsBaked;
        System.out.println("Muffins needed: " + muffinsNeeded);
        
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int crayonsWilly = 1400;
        int crayonsLucy = 290;
        int crayonsTotal = crayonsWilly + crayonsLucy;
        System.out.println("Total crayons: " + crayonsTotal);
        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersPerPage = 10;
        int pages = 22;
        int totalStickers = pages * stickersPerPage;
        System.out.println("Total stickers: " + totalStickers);
        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int cupcakes = 96;
        int children = 8;
        int cupcakesPerChild = cupcakes / children;
        System.out.println("Cupcakes per child: " + cupcakesPerChild);
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int cookies = 47;
        int cookiesPerJar = 6;
        int leftoverCookies = cookies % cookiesPerJar;
        System.out.println("Cookies not placed in jar: " + leftoverCookies);
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int croissants = 59;
        int neighbors = 8;
        int leftoverCroissants = croissants % neighbors;
        System.out.println("Croissants not given to neighbors: " + leftoverCroissants);
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int cookiesPerTray = 12;
        int oatmealCookies = 276;
        int traysNeeded = oatmealCookies / cookiesPerTray;
        System.out.println("Trays needed: " + traysNeeded);
            
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int pretzels = 480;
        int serving = 12;
        int pretzelServings = pretzels / serving;
        System.out.println("Servings of pretzels: " + pretzelServings);
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int lemonCupcakes = 53;
        int cupcakesLeftBehind = 2;
        int totalLemonCupcakes = lemonCupcakes - cupcakesLeftBehind;
        int cupcakesPerBox = 3;
        int boxesGiven = totalLemonCupcakes / cupcakesPerBox;
        System.out.println("Boxes given away: " + boxesGiven);
            
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotSticks = 74;
        int numberOfPeople = 12;
        int remainingCarrotSticks = carrotSticks % numberOfPeople;
        System.out.println("Uneated carrot sticks: " + remainingCarrotSticks);
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int teddyBears = 98;
        int bearsPerShelf = 7;
        int totalShelves = teddyBears / bearsPerShelf;
        System.out.println("Shelves filled: " + totalShelves);
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int picturesPerAlbum = 20;
        int pictures = 480;
        int totalAlbums = pictures / picturesPerAlbum;
        System.out.println("Number of albums: " + totalAlbums);
        
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int tradingCards = 94;
        int cardsPerBox = 8;
        int totalBoxesFilled = tradingCards / cardsPerBox;
        int remainingCards = tradingCards % cardsPerBox;
        System.out.println("Boxes filled: " + totalBoxesFilled + ". Cards in unfilled box: " + remainingCards);
            
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int books = 210;
        int availableShelves = 10;
        int booksPerShelf = books / availableShelves;
        System.out.println("Books per shelf: " + booksPerShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        croissants = 17;
        int guests = 7;
        float croissantsPerGuest = (float)croissants/guests;
        System.out.println("Croissants per guest: " + croissantsPerGuest);
        //or if we're keeping croissants whole...int crossaintsPerGuest = croissants/guests;//
        
	}

}

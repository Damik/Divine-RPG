package net.divinerpg.helper.config;

import java.io.File;
import java.util.HashMap;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.divinerpg.helper.HelperBase;
import net.minecraftforge.common.Configuration;

public class ConfigHelper extends HelperBase {

	public static File file;
	public static Configuration config;

	public static HashMap<String, Integer> idMap = new HashMap<String, Integer>();

	public static int block = 700;
	public static int gen = 200;
	public static int item = 6666;

	public static void initConfig(FMLPreInitializationEvent e) {
		 file = new File(e.getModConfigurationDirectory(), "DivineRPG.cfg");
		 config = new Configuration(file);
		 
		config.load();
		blockConfig();
		itemConfig();
		config.save();
	}

	public static void addBlock(String name) {
		config.getBlock(name, block);
		idMap.put(name, config.getBlock(name, block).getInt());
		block++;
	}

	public static void addTerrainBlock(String cat, String name) {
		config.get(cat, name, gen);
		idMap.put(name, config.get(cat, name, gen).getInt());
		gen++;
	}

	public static void addItem(String name) {
		config.getItem(name, item);
		idMap.put(name, config.getItem(name, item).getInt());
		item++;
	}

	public static int getID(String name) {
		if(idMap.containsKey(name)) {
			return idMap.get(name);
		} else {
			System.out.println("Couldn't find ID for " + name + "!!!");
			System.exit(1);
			return 0;
		}
	}

	public static void blockConfig(){
		addTerrainBlock("Dravite","DraviteGrass");
		addTerrainBlock("Dravite","DraviteDirt");
		addTerrainBlock("Azurite","AzuriteGrass");
		addTerrainBlock("Azurite","AzuriteDirt");
		addTerrainBlock("Uvite","UviteGrass");
		addTerrainBlock("Uvite","UviteDirt");
		addTerrainBlock("Mythril","MythrilGrass");
		addTerrainBlock("Mythril","MythrilDirt");
		addTerrainBlock("Augite","AugiteGrass");
		addTerrainBlock("Augite","AugiteDirt");
		addTerrainBlock("Iceika","IceikaGrass");
		addTerrainBlock("Iceika","IceikaDirt");
		addTerrainBlock("Iceika","IceikaStone");
		addTerrainBlock("Twilight","TwilightStone");
		addTerrainBlock("Arcana","ArcanaGrass");
		addTerrainBlock("Arcana","ArcanaDirt");

		addTerrainBlock("Vethea","DreamGrass");
		addTerrainBlock("Vethea","DreamDirt");
		addTerrainBlock("Vethea","DreamStone");

		addBlock("RupeeOre");
		addBlock("ArlemiteOre");
		addBlock("RealmiteOre");
		addBlock("NetheriteOre");
		addBlock("BloodGemOre");
		addBlock("BlueFire");
		addBlock("DivineRock");
		addBlock("RupeeBlock");
		addBlock("ArlemiteBlock");
		addBlock("RealmiteBlock");
		addBlock("NetheriteBlock");
		addBlock("ObsidianBlock");
		addBlock("DivinePlank");
		addBlock("DivineMossyStone");
		addBlock("DivineDungeonSpawner");
		addBlock("DivineLeaves");
		addBlock("DivineLog");
		addBlock("AquaLamp");
		addBlock("ArlemiteLamp");
		addBlock("BlazeLamp");
		addBlock("BlueFireLamp");
		addBlock("DivineLamp");
		addBlock("DrakenLamp");
		addBlock("DraviteLamp");
		addBlock("EnderLamp");
		addBlock("GoldLamp");
		addBlock("LavaLamp");
		addBlock("LapisLamp");
		addBlock("MilkyLamp");
		addBlock("MoltenLamp");
		addBlock("NetheriteLamp");
		addBlock("RedstoneLamp");
		addBlock("RupeeLamp");
		addBlock("SlimeLight");
		addBlock("IceLamp");
		addBlock("KrakenLamp");
		addBlock("RealmiteLamp");
		addBlock("JungleLamp");
		addBlock("DiamondLamp");
		addBlock("BedRockBlock");
		addBlock("DarkStone");
		addBlock("SpiderPumpkin");
		addBlock("EnderPumpkin");
		addBlock("CreeperPumpkin");
		addBlock("SkeletonPumpkin");
		addBlock("BlazePumpkin");
		addBlock("ZombiePumpkin");
		addBlock("IceManPumpkin");
		addBlock("CyclopsePumpkin");
		addBlock("GhastPumpkin");
		addBlock("FrostPumpkin");
		addBlock("EnderWatcherPumpkin");
		addBlock("JungleSpiderPumpkin");
		addBlock("HellSpiderPumpkin");
		addBlock("Tar");
		addBlock("BlueFence");
		addBlock("BlueFenceOn");
		addBlock("RedFence");
		addBlock("RedFenceOn");
		addBlock("GreenFence");
		addBlock("GreenFenceOn");
		addBlock("AyeracoBlueBeam");
		addBlock("AyeracoGreenBeam");
		addBlock("AyeracoRedBeam");
		addBlock("AyeracoPurpleBeam");
		addBlock("AyeracoYellowBeam");
		addBlock("AntiNetherPortal");
		addBlock("GreenColouredVein");
		addBlock("PurpleColouredVein");
		addBlock("YellowColouredVein");
		addBlock("RedColouredVein");
		addBlock("CyanColouredVein");
		addBlock("AquaBricks");
		addBlock("ArlemiteBricks");
		addBlock("DarkStoneBricks");
		addBlock("DiamondBricks");
		addBlock("LapisLazuliBricks");
		addBlock("LavaBricks");
		addBlock("MilkStoneBricks");
		addBlock("NetheriteBricks");
		addBlock("RealmiteBricks");
		addBlock("RedStoneBricks");
		addBlock("MilkStoneMiniBricks");
		addBlock("Acceleraunch");
		addBlock("Accelleron");
		addBlock("PurpleStone");
		addBlock("Light1");
		addBlock("Light2");
		addBlock("BlueTorch");
		addBlock("GreenTorch");
		addBlock("OrangeTorch");
		addBlock("PinkTorch");
		addBlock("PurpleTorch");
		addBlock("SkeletonTorch");
		addBlock("BlueLight");
		addBlock("GreenLight");
		addBlock("PurpleLight");
		addBlock("RedLight");
		addBlock("YellowLight");
		addBlock("CheckerBlock");
		addBlock("RainbowWool");
		addBlock("TomatoPlant");
		addBlock("DirtBlock");
		addBlock("SoulSandBlock");
		addBlock("Milkstone");
		addBlock("GreenCandyCane");
		addBlock("PurpleCandyCane");
		addBlock("BlueCandyCane");
		addBlock("RedCandyCane");
		addBlock("YellowCandyCane");
		addBlock("StainedGlass");
		addBlock("StainedGlass1");
		addBlock("StainedGlass2");
		addBlock("StainedGlass3");
		addBlock("StainedGlass4");
		addBlock("StainedGlass5");
		addBlock("StainedGlass6");
		addBlock("StainedGlass7");
		addBlock("SuperEnchantTable");
		addBlock("DravitePortal");
		addBlock("AzuritePortal");
		addBlock("UvitePortal");
		addBlock("MythrilPortal");
		addBlock("AugitePortal");
		addBlock("DraviteBlock");
		addBlock("AzuriteBlock");
		addBlock("UviteBlock");
		addBlock("MythrilBlock");
		addBlock("AugiteBlock");
		addBlock("DraviteLeaves");
		addBlock("AzuriteLeaves");
		addBlock("UviteLeaves");
		addBlock("MythrilLeaves");
		addBlock("AugiteLeaves");
		addBlock("DraviteLog");
		addBlock("AzuriteLog");
		addBlock("UviteLog");
		addBlock("MythrilLog");
		addBlock("AugiteLog");
		addBlock("DraviteOre");
		addBlock("AzuriteOre");
		addBlock("UviteOre");
		addBlock("MythrilOre");
		addBlock("AugiteOre");
		addBlock("AzuriteVine");
		addBlock("IceikaPortal");
		addBlock("IceDoor");
		addBlock("IceLog");
		addBlock("IceLeaves");
		addBlock("CoalStone");
		addBlock("WorkShopLamp");
		addBlock("SnowBrick");
		addBlock("IceBrick");
		addBlock("WorkBookcase");
		addBlock("FrostGlass");
		addBlock("CoalStoneFurnace");
		addBlock("FrostChest");
		addBlock("FrostStone");
		addBlock("RolumSpawner");
		addBlock("GlacideSpawner");
		addBlock("WorkCarpet");
		addBlock("CoalStoneFurnaceOn");
		addBlock("ArcanaPortal");
		addBlock("BlockOfLight");
		addBlock("ArcanaPortalFrame");
		addBlock("MoltenFurnace");
		addBlock("MoltenFurnaceOn");
		addBlock("MoonLightFurnace");
		addBlock("MoonLightFurnaceOn");
		addBlock("OceanFireFurnace");
		addBlock("OceanFireFurnaceOn");
		addBlock("WhiteFireFurnace");
		addBlock("WhiteFireFurnaceOn");
		addBlock("GreenLightFurnace");
		addBlock("GreenLightFurnaceOn");
		addBlock("DemonFurnace");
		addBlock("DemonFurnaceOn");
		addBlock("FireStock");
		addBlock("FireStock2");
		addBlock("PinFly");
		addBlock("PinFly2");
		addBlock("Hitchak");
		addBlock("EucalyptusRoot");
		addBlock("Veilo");
		addBlock("Lamona");
		addBlock("Aquamarine");
		addBlock("Marsine");
		addBlock("ArcaniumOre");
		addBlock("StarBridge");
		addBlock("StarBridgeOn");
		addBlock("Extractor");
		addBlock("HeatTrap");
		addBlock("HeatTrapOn");
		addBlock("AncientBricks");
		addBlock("DegradedBricks");
		addBlock("ArcaniumMetal");
		addBlock("ArcaniumPower");
		addBlock("AncientStone");
		addBlock("SoulStone");
		addBlock("DungeonLamp");
		addBlock("AncientTile");
		addBlock("SoulSludge");
		addBlock("ParasectaAltar");
		addBlock("DramixAltar");
		addBlock("RoamerSpawner");
		addBlock("DeathcryxSpawner");
		addBlock("DeathHoundSpawner");
		addBlock("RazorbackSpawner");
		addBlock("LivingStatueSpawner");
		addBlock("DungeonPrisonerSpawner");
		addBlock("ArcaniteTubes");
		addBlock("ArcaniteRails");
		addBlock("OreDoor1");
		addBlock("OreDoor2");
		addBlock("OreDoor3");
		addBlock("OreDoor4");
		addBlock("KingStatue");
		addBlock("AncientStatue");
		addBlock("AyeracoStatue");
		addBlock("TwilightStatue");
		addBlock("VamacheronStatue");
		addBlock("DensosStatue");
		addBlock("DexStatue");
		addBlock("DramixStatue");
		addBlock("ParasectaStatue");
		addBlock("SoulStatue");
		addBlock("WatcherStatue");
		addBlock("DraviteChestBlock");
		addBlock("IceSapling");

		addBlock("VetheaPortal");
		addBlock("DreamWood");
		addBlock("DreamWoodLeaves");
		addBlock("DreamBricks");
		addBlock("LunaStone");
		addBlock("LunaBricks");
		addBlock("MetalCaging");
		addBlock("DreamLamp");
		addBlock("DreamLampOn");
		addBlock("WeedWoodVine");
		addBlock("BlossomingWeedWoodVine");
		addBlock("CryptWall");
		addBlock("SmoothGlass");
		addBlock("VillageLamp");
		addBlock("InfusionTable");
		addBlock("CellLamp");
		addBlock("BarredDoor");
		addBlock("FireCrystal");
		addBlock("FireLight");
		addBlock("HyreWood");
		addBlock("MintWoodLeaves");
		addBlock("FireWall");
		addBlock("KarosHeatTileRed");
		addBlock("KarosHeatTileGreen");
		addBlock("KarosCannon");
		addBlock("HelioticBeam");
		addBlock("CryptFloor");
		addBlock("FireWood");
		addBlock("ChamberWall");
		addBlock("ChamberWall1");
		addBlock("ChamberWall2");
		addBlock("BacterialAcid");
		addBlock("GemTopPurple");
		addBlock("YellowDulah");
		addBlock("BlockAcid");
		addBlock("HallWall");
		addBlock("WreckAltar");
		addBlock("RaglokAltar");
		addBlock("KarosAltar");
		addBlock("LunicAltar");
		addBlock("HiveWall");
		addBlock("QuadroticAltar");
		addBlock("EverStone");
		addBlock("LunicAcid");
		addBlock("FireWoodLeaves");
		addBlock("HyreWoodLeaves");
		addBlock("GemTopGreen");
		addBlock("GreenDulah");
		addBlock("MintWood");
		addBlock("LightFireWoodLeaves");
		addBlock("CrackleSpike");
		addBlock("Fernite");
		addBlock("Bulatobe");
		addBlock("ShineGrass");
		addBlock("Shimmer");
		addBlock("DreamGlow");
		addBlock("HyreWoodVine");
		addBlock("DreamBricks2");
		addBlock("WhiteEverStone");
		addBlock("DarkEverStone");
		addBlock("KarosBricks");
		addBlock("KarosBricks2");
		addBlock("BiphronSpawner");
		addBlock("GorgosionSpawner");
		addBlock("TwinsSpawner");
		addBlock("DuoSpawner");
		addBlock("VermenousSpawner");
		addBlock("DreamWreckerSpawner");
		addBlock("LorgaSpawner");
		addBlock("HungerStone1");
		addBlock("HungerStone2");
		addBlock("PurpleFire");
	}

	public static void itemConfig(){
		addItem("Tomato");
		addItem("BedRockMaul");
		addItem("SoundOfMusic");
		addItem("JungleShard");
		addItem("MoltenShard");
		addItem("CorruptedShard");
		addItem("IceShard");
		addItem("DivineShard");
		addItem("Shuriken");
		addItem("RupeeIngot");
		addItem("Namkormira");
		addItem("SerenadeStriker");
		addItem("SlimeSword");
		addItem("ShadowBow");
		addItem("CrabClawCannon");
		addItem("FrostClawCannon");
		addItem("FrostSword");
		addItem("DivineSword");
		addItem("SandSlash");
		addItem("EnderSword");
		addItem("EnderSwordBlue");
		addItem("EnderSwordBlack");
		addItem("EnderSwordGreen");
		addItem("EnderSwordRed");
		addItem("EnderSwordYellow");
		addItem("BlueFireBow");
		addItem("TomatoSeeds");
		addItem("JackOManBoots");
		addItem("JackOManLegs");
		addItem("JackOManBody");
		addItem("JackOManHelmet");
		addItem("Scythe");
		addItem("SharkAnchor");
		addItem("HealingStone");
		addItem("Massivence");
		addItem("Palavence");
		addItem("ArlemiteStabber");
		addItem("RupeeRapier");
		addItem("RealmiteSword");
		addItem("PoisonSaber");
		addItem("TwilightClock");
		addItem("SerenadeDeath");
		addItem("SerenadeHealth");
		addItem("SerenadeGrowth");
		addItem("Mailstrom");
		addItem("CrabAnchor");
		addItem("BowheadAnchor");
		addItem("CrabClawMaul");
		addItem("RupeeSword");
		addItem("Passivence");
		addItem("AngelicBody");
		addItem("AngelicHelmet");
		addItem("AngelicLegs");
		addItem("AngelicBoots");
		addItem("EnderShard");
		addItem("MoltenSword");
		addItem("BedRockSword");
		addItem("BloodGem");
		addItem("ArlemiteIngot");
		addItem("RealmiteIngot");
		addItem("NetheriteIngot");
		addItem("RupeeShovel");
		addItem("RupeeAxe");
		addItem("RupeeHoe");
		addItem("RupeePickaxe");
		addItem("ArlemiteShovel");
		addItem("ArlemiteAxe");
		addItem("ArlemiteHoe");
		addItem("ArlemitePickaxe");
		addItem("RealmiteShovel");
		addItem("RealmiteAxe");
		addItem("RealmiteHoe");
		addItem("RealmitePickaxe");
		addItem("RupeeShickaxe");
		addItem("ArlemiteShickaxe");
		addItem("HellStoneIngot");
		addItem("PurpleBlaze");
		addItem("ShadowBar");
		addItem("NetheriteChunk");
		addItem("LegendaryEnderEye");
		addItem("RealmiteHelmet");
		addItem("RealmiteBody");
		addItem("RealmiteLegs");
		addItem("RealmiteBoots");
		addItem("ArlemiteHelmet");
		addItem("ArlemiteBody");
		addItem("ArlemiteLegs");
		addItem("ArlemiteBoots");
		addItem("GrimReaperHelmet");
		addItem("GrimReaperBody");
		addItem("GrimReaperLegs");
		addItem("GrimReaperBoots");
		addItem("RupeeHelmet");
		addItem("RupeeBody");
		addItem("RupeeLegs");
		addItem("RupeeBoots");
		addItem("InfernalFlame");
		addItem("BaseSpawnCrystal");
		addItem("SoulFiendSpawnCrystal");
		addItem("VamacheronSpawnCrystal");
		addItem("TwilightDemonSpawnCrystal");
		addItem("KarotSpawnCrystal");
		addItem("DensosSpawnCrystal");
		addItem("HordeHorn");
		addItem("MysteriousClock");
		addItem("WatchingEye");
		addItem("CallOfTheWatcher");
		addItem("FuryFire");
		addItem("ShadowHelmet");
		addItem("ShadowBody");
		addItem("ShadowLegs");
		addItem("ShadowBoots");
		addItem("AquaticHelmet");
		addItem("AquaticBody");
		addItem("AquaticLegs");
		addItem("AquaticBoots");
		addItem("KrakenSkin");
		addItem("KrakenScale");
		addItem("ShadowStone");
		addItem("HomeTeleporter");
		addItem("WhaleFin");
		addItem("PurpleGlowTree");
		addItem("PinkGlowTree");
		addItem("EliteRealHelmet");
		addItem("EliteRealBody");
		addItem("EliteRealLegs");
		addItem("EliteRealBoots");
		addItem("KrakenHelmet");
		addItem("KrakenBody");
		addItem("KrakenLegs");
		addItem("KrakenBoots");
		addItem("DivineStick");
		addItem("DivineWoodAxe");
		addItem("DivineWoodPick");
		addItem("DivineWoodHoe");
		addItem("DivineWoodShovel");
		addItem("DivineWoodSword");
		addItem("CyclopseEye");
		addItem("CyclopseBow");
		addItem("CyclopseStaff");
		addItem("CyclopseSword");
		addItem("TwilightApple");
		addItem("DivineSword");
		addItem("SharkFin");
		addItem("CorruptedMaul");
		addItem("SerenadeOfDeath");
		addItem("InfernoSword");
		addItem("SerenadeOfLife");
		addItem("DeathBringer");
		addItem("CorruptCannon");
		addItem("SharkSword");
		addItem("GhastCannon");
		addItem("Aquaton");
		addItem("BowheadCannon");
		addItem("OceanKnife");
		addItem("Maelstrom");
		addItem("AquaticTrident");
		addItem("CrabAnchor");
		addItem("InfernoBow");
		addItem("AquaticDagger");
		addItem("BlueFireStone");
		addItem("DivineStone");
		addItem("CorruptedStone");
		addItem("JungleStone");
		addItem("IceStone");
		addItem("MoltenStone");
		addItem("EnderStone");
		addItem("VileStorm");
		addItem("CrabClaw");
		addItem("IronHelmet");
		addItem("IronBody");
		addItem("IronLegs");
		addItem("IronBoots");
		addItem("DiamondHelmet");
		addItem("DiamondBody");
		addItem("DiamondLegs");
		addItem("DiamondBoots");
		addItem("AquaticStone");
		addItem("AquaticPellets");
		addItem("PureAquaticPellets");
		addItem("BedRockAxe");
		addItem("BedRockPickaxe");
		addItem("BedRockShovel");
		addItem("BloodGemSword");
		addItem("NetheriteHelmet");
		addItem("NetheriteBody");
		addItem("NetheriteLegs");
		addItem("NetheriteBoots");
		addItem("InfernoHelmet");
		addItem("InfernoBody");
		addItem("InfernoLegs");
		addItem("InfernoBoots");
		addItem("EnderHelmet");
		addItem("EnderBody");
		addItem("EnderLegs");
		addItem("EnderBoots");
		addItem("BedRockHelmet");
		addItem("BedRockBody");
		addItem("BedRockLegs");
		addItem("BedRockBoots");
		addItem("DraviteGem");
		addItem("DraviteChunk");
		addItem("DraviteFragment");
		addItem("DraviteDust");
		addItem("DraviteBlade");
		addItem("DravitePhaser");
		addItem("DraviteBlitz");
		addItem("DraviteBow");
		addItem("DraviteHelmet");
		addItem("DraviteBoots");
		addItem("DraviteLegs");
		addItem("DraviteBody");
		addItem("DraviteSlicer");
		addItem("DraviteSoul");
		addItem("DraviteSparkles");
		addItem("DraviteShards");
		addItem("AzuriteGem");
		addItem("AzuriteChunk");
		addItem("AzuriteFragment");
		addItem("AzuriteDust");
		addItem("AzuriteBlade");
		addItem("AzuritePhaser");
		addItem("AzuriteBlitz");
		addItem("AzuriteBow");
		addItem("AzuriteHelmet");
		addItem("AzuriteBoots");
		addItem("AzuriteLegs");
		addItem("AzuriteBody");
		addItem("AzuriteSlicer");
		addItem("AzuriteSoul");
		addItem("AzuriteArrow");
		addItem("UviteGem");
		addItem("UviteChunk");
		addItem("UviteFragment");
		addItem("UviteDust");
		addItem("UviteBlade");
		addItem("UvitePhaser");
		addItem("UviteBlitz");
		addItem("UviteBow");
		addItem("UviteHelmet");
		addItem("UviteBoots");
		addItem("UviteLegs");
		addItem("UviteBody");
		addItem("UviteSlicer");
		addItem("UviteSoul");
		addItem("MythrilGem");
		addItem("MythrilChunk");
		addItem("MythrilFragment");
		addItem("MythrilDust");
		addItem("MythrilBlade");
		addItem("MythrilPhaser");
		addItem("MythrilBlitz");
		addItem("MythrilBow");
		addItem("MythrilHelmet");
		addItem("MythrilBoots");
		addItem("MythrilLegs");
		addItem("MythrilBody");
		addItem("MythrilSlicer");
		addItem("MythrilSoul");
		addItem("AugiteGem");
		addItem("AugiteChunk");
		addItem("AugiteFragment");
		addItem("AugiteDust");
		addItem("AugiteBlade");
		addItem("AugitePhaser");
		addItem("AugiteBlitz");
		addItem("AugiteBow");
		addItem("AugiteHelmet");
		addItem("AugiteBoots");
		addItem("AugiteLegs");
		addItem("AugiteBody");
		addItem("AugiteSlicer");
		addItem("AugiteSoul");
		addItem("HaliteBlade");
		addItem("HalitePhaser");
		addItem("HaliteBlitz");
		addItem("HaliteBow");
		addItem("HaliteHelmet");
		addItem("HaliteBoots");
		addItem("HaliteLegs");
		addItem("HaliteBody");
		addItem("HaliteSlicer");
		addItem("FuryArrow");
		addItem("TwilightClock");
		addItem("TwilightBow");
		addItem("BlueSeeds");
		addItem("MagicMeat");
		addItem("EmpoweredMeat");
		addItem("EnrichedMagicMeat");
		addItem("CookedEmpoweredMeat");
		addItem("PurpleSeeds");
		addItem("PinkSeeds");
		addItem("DraviteShickaxe");
		addItem("AzuriteShickaxe");
		addItem("UviteShickaxe");
		addItem("MythrilShickaxe");
		addItem("AugiteShickaxe");
		addItem("DivineShickaxe");
		addItem("DivineHelmet");
		addItem("DivineBody");
		addItem("DivineLegs");
		addItem("DivineBoots");
		addItem("DraviteAxe");
		addItem("DravitePickaxe");
		addItem("DraviteShovel");
		addItem("AugiteAxe");
		addItem("AugitePickaxe");
		addItem("AugiteShovel");
		addItem("AzuriteAxe");
		addItem("AzuritePickaxe");
		addItem("AzuriteShovel");
		addItem("UviteAxe");
		addItem("UvitePickaxe");
		addItem("UviteShovel");
		addItem("DivineAxe");
		addItem("DivinePickaxe");
		addItem("DivineShovel");
		addItem("MythrilAxe");
		addItem("MythrilPickaxe");
		addItem("MythrilShovel");
		addItem("SnowFlakeShuriken");
		addItem("Frossivence");
		addItem("SerenadeOfIce");
		addItem("GlacierSword");
		addItem("IcicleBow");
		addItem("IcicleBane");
		addItem("IceDoorItem");
		addItem("FrostCannon");
		addItem("FractiteCannon");
		addItem("FrostkingSword");
		addItem("SoundOfCarols");
		addItem("EnderIce");
		addItem("SnowStormBow");
		addItem("IcineSword");
		addItem("FrozenMaul");
		addItem("SnowSlash");
		addItem("PepperMints");
		addItem("EggNog");
		addItem("ChocolateLog");
		addItem("SnowCone");
		addItem("FruitCake");
		addItem("SnowFlake");
		addItem("SantaHelmet");
		addItem("SantaBody");
		addItem("SantaLegs");
		addItem("SantaBoots");
		addItem("FractiteCannon");
		addItem("Key1");
		addItem("Key2");
		addItem("Key3");
		addItem("Key4");
		addItem("OreDoor1Item");
		addItem("OreDoor2Item");
		addItem("OreDoor3Item");
		addItem("OreDoor4Item");
		addItem("HitchakItem");
		addItem("FireStockItem");
		addItem("PinFlyItem");
		addItem("VeiloItem");
		addItem("LamonaItem");
		addItem("AquamarineItem");
		addItem("MarsineItem");
		addItem("HitchakSeeds");
		addItem("EucalyptusRootSeeds");
		addItem("VeiloSeeds");
		addItem("LamonaSeeds");
		addItem("AquamarineSeeds");
		addItem("MarsineSeeds");
		addItem("PinFlySeeds");
		addItem("FireStockSeeds");
		addItem("Arcanium");
		addItem("FyracryxSpawner");
		addItem("FireFly");
		addItem("Starfall");
		addItem("Reflector");
		addItem("StormSword");
		addItem("StaffOfStarlight");
		addItem("WraithBane");
		addItem("CaptainsSparkler");
		addItem("ShadowSword");
		addItem("EnderScepter");
		addItem("GrenadeLauncher");
		addItem("Grenade");
		addItem("MeriksMissile");
		addItem("ArcaniumSaber");
		addItem("ParatikuSpawner");
		addItem("SeimerSpawner");
		addItem("GolemOfRejuvSpawner");
		addItem("DungeonToken");
		addItem("LiviciaSword");
		addItem("VemosHelmet");
		addItem("VemosBody");
		addItem("VemosLegs");
		addItem("VemosBoots");
		addItem("KormaHelmet");
		addItem("KormaBody");
		addItem("KormaLegs");
		addItem("KormaBoots");
		addItem("WizardBook");
		addItem("ArcaniumBucket");
		addItem("TarBucket");
		addItem("CollectorFragments");
		addItem("Collector");
		addItem("OrbOfLight");
		addItem("WeakArcanaPotion");
		addItem("StrongArcanaPotion");
		addItem("StaffOfEnrichment");
		addItem("Donut");
		addItem("ChickenDinner");
		addItem("PizzaDough");
		addItem("Pizza");
		addItem("BoiledEgg");
		addItem("Bacon");
		addItem("Cheese");

		addItem("TeakerDisk");
		addItem("AmthrimisDisk");
		addItem("DarvenDisk");
		addItem("CermileDisk");
		addItem("PardimalDisk");
		addItem("QuadroticDisk");
		addItem("KarosDisk");
		addItem("HeliosisDisk");
		addItem("ArksianeDisk");
		addItem("SpineBackDisk");
		addItem("TeakerHammer");
		addItem("AmthrimisHammer");
		addItem("DarvenHammer");
		addItem("CermileHammer");
		addItem("PardimalHammer");
		addItem("QuadroticHammer");
		addItem("KarosHammer");
		addItem("HeliosisHammer");
		addItem("ArksianeHammer");
		addItem("TeakerSword");
		addItem("AmthrimisSword");
		addItem("DarvenSword");
		addItem("CermileSword");
		addItem("PardimalSword");
		addItem("QuadroticSword");
		addItem("KarosSword");
		addItem("HeliosisSword");
		addItem("ArksianeSword");
		addItem("TeakerClaw");
		addItem("AmthrimisClaw");
		addItem("DarvenClaw");
		addItem("CermileClaw");
		addItem("PardimalClaw");
		addItem("QuadroticClaw");
		addItem("KarosClaw");
		addItem("HeliosisClaw");
		addItem("ArksianeClaw");
		addItem("TeakerCannon");
		addItem("AmthrimisCannon");
		addItem("DarvenCannon");
		addItem("CermileCannon");
		addItem("PardimalCannon");
		addItem("QuadroticCannon");
		addItem("KarosCannonItem");
		addItem("HeliosisCannon");
		addItem("ArksianeCannon");
		addItem("AcidFire");
		addItem("TeakerBow");
		addItem("AmthrimisBow");
		addItem("DarvenBow");
		addItem("CermileBow");
		addItem("PardimalBow");
		addItem("QuadroticBow");
		addItem("KarosBow");
		addItem("HeliosisBow");
		addItem("ArksianeBow");
		addItem("VetheanArrow");
		addItem("VetheanArrow2");
		addItem("VetheanWarArrow");
		addItem("VetheanWrathArrow");
		addItem("VetheanHammerTemplate");
		addItem("VetheanBackSwordTemplate");
		addItem("VetheanBowTemplate");
		addItem("VetheanCannonTemplate");
		addItem("VetheanClawTemplate");
		addItem("VetheanDiskTemplate");
		addItem("VetheanStaffTemplate");
		addItem("VetheanDegradedTemplate");
		addItem("VetheanFinishedTemplate");
		addItem("VetheanGlisteningTemplate");
		addItem("VetheanDemonizedTemplate");
		addItem("VetheanTormentedTemplate");
		addItem("HoneySuckle");
		addItem("DreamCarrot");
		addItem("DreamMelon");
		addItem("DreamPie");
		addItem("DreamCake");
		addItem("TeakerLump");
		addItem("AmthrimisLump");
		addItem("DarvenLump");
		addItem("CermileLump");
		addItem("PardimalLump");
		addItem("QuadroticLump");
		addItem("KarosLump");
		addItem("HeliosisLump");
		addItem("ArksianeLump");
		addItem("DreamSweets");
		addItem("DreamSours");
		addItem("DegradedHelmetMelee");
		addItem("DegradedHelmetRanged");
		addItem("DegradedHelmetArcana");
		addItem("DegradedBody");
		addItem("DegradedLegs");
		addItem("DegradedBoots");
		addItem("FinishedHelmetMelee");
		addItem("FinishedHelmetRanged");
		addItem("FinishedHelmetArcana");
		addItem("FinishedBody");
		addItem("DinishedLegs");
		addItem("FinishedBoots");
		addItem("GlisteningHelmetMelee");
		addItem("GlisteningHelmetRanged");
		addItem("GlisteningHelmetArcana");
		addItem("GlisteningBody");
		addItem("GlisteningLegs");
		addItem("GlisteningBoots");
		addItem("DemonizedHelmetMelee");
		addItem("DemonizedHelmetRanged");
		addItem("DemonizedHelmetArcana");
		addItem("DemonizedBody");
		addItem("DemonizedLegs");
		addItem("DemonizedBoots");
		addItem("TormentedHelmetMelee");
		addItem("TormentedHelmetRanged");
		addItem("TormentedHelmetArcana");
		addItem("TormentedBody");
		addItem("TormentedLegs");
		addItem("TormentedBoots");
		addItem("DirtyPearls");
		addItem("CleanPearls");
		addItem("PolishedPearls");
		addItem("ShinyPearls");
		addItem("HoneyChunk");
		addItem("RockChunk");
		addItem("Fyrossom");
		addItem("HeivaBelt");
		addItem("MoonCloud");
		addItem("WormChunks");
		addItem("VhraakTeeth");
		addItem("DreamFlint");
		addItem("MoonClock");
		addItem("SpineBackChunk");
		addItem("SpineBackCannon");
		addItem("SpineBackDisk");
		addItem("SpineBackHammer");
		addItem("SpineBackStaff");
		addItem("EverLight");
		addItem("EverBright");
		addItem("EverNight");
		addItem("EverSight");
		addItem("EverFight");
		addItem("EverArrow");
		addItem("TeakerStaff");
		addItem("AmthrimisStaff");
		addItem("DarvenStaff");
		addItem("CermileStaff");
		addItem("PardimalStaff");
		addItem("QuadroticStaff");
		addItem("KarosStaff");
		addItem("HeliosisStaff");
		addItem("ArksianeStaff");
		addItem("DreamPowder");
		addItem("BarredDoorItem");
	}

}
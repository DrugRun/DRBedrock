package me.vinex_.drbedrock.utils;

import org.bukkit.ChatColor;

/**
 * Created by Ryan on 12/23/14.
 */
public class C {
	public static String scramble = ChatColor.MAGIC.toString();
	public static String bold = ChatColor.BOLD.toString();
	public static String strike = ChatColor.STRIKETHROUGH.toString();
	public static String underline = ChatColor.UNDERLINE.toString();
	public static String italics = ChatColor.ITALIC.toString();

	public static String reset = ChatColor.RESET.toString();

	public static String aqua = ChatColor.AQUA.toString();
	public static String black = ChatColor.BLACK.toString();
	public static String blue = ChatColor.BLUE.toString();
	public static String daqua = ChatColor.DARK_AQUA.toString();
	public static String dblue = ChatColor.DARK_BLUE.toString();
	public static String dgray = ChatColor.DARK_GRAY.toString();
	public static String dgreen = ChatColor.DARK_GREEN.toString();
	public static String dpurple = ChatColor.DARK_PURPLE.toString();
	public static String dred = ChatColor.DARK_RED.toString();
	public static String gold = ChatColor.GOLD.toString();
	public static String gray = ChatColor.GRAY.toString();
	public static String green = ChatColor.GREEN.toString();
	public static String purple = ChatColor.LIGHT_PURPLE.toString();
	public static String red = ChatColor.RED.toString();
	public static String white = ChatColor.WHITE.toString();
	public static String yellow = ChatColor.YELLOW.toString();
	public static String translate = ChatColor.YELLOW.toString();

	public static String mHead = ChatColor.BLUE.toString();
	public static String mBody = ChatColor.GRAY.toString();
	public static String mChat = ChatColor.WHITE.toString();
	public static String mElem = ChatColor.YELLOW.toString();
	public static String mCount = ChatColor.YELLOW.toString();
	public static String mTime = ChatColor.GREEN.toString();
	public static String mItem = ChatColor.YELLOW.toString();
	public static String mSkill = ChatColor.GREEN.toString();
	public static String mLink = ChatColor.GREEN.toString();
	public static String mGems = ChatColor.GREEN.toString();
	public static String mLoot = ChatColor.RED.toString();
	public static String mGame = ChatColor.LIGHT_PURPLE.toString();

	public static String wField = ChatColor.WHITE.toString();
	public static String wFrame = ChatColor.DARK_GRAY.toString();

	public static String descHead = ChatColor.DARK_GREEN.toString();
	public static String descBody = ChatColor.WHITE.toString();

	public static String chatPMHead = ChatColor.DARK_GREEN.toString();
	public static String chatPMBody = ChatColor.GREEN.toString();

	public static String chatClanHead = ChatColor.DARK_AQUA.toString();
	public static String chatClanBody = ChatColor.AQUA.toString();

	public static String chatAdminHead = ChatColor.DARK_PURPLE.toString();
	public static String chatAdminBody = ChatColor.LIGHT_PURPLE.toString();

	public static String listTitle = ChatColor.WHITE.toString();
	public static String listValue = ChatColor.YELLOW.toString();
	public static String listValueOn = ChatColor.GREEN.toString();
	public static String listValueOff = ChatColor.RED.toString();

	public static String rAll = ChatColor.WHITE.toString();
	public static String rHelp = ChatColor.GREEN.toString();
	public static String rMod = ChatColor.GOLD.toString();
	public static String rAdmin = ChatColor.RED.toString();
	public static String rOwner = ChatColor.DARK_RED.toString();

	public static String consoleHead = ChatColor.RED.toString();
	public static String consoleFill = ChatColor.WHITE.toString();
	public static String consoleBody = ChatColor.YELLOW.toString();

	public static String sysHead = ChatColor.DARK_GRAY.toString();
	public static String sysBody = ChatColor.GRAY.toString();

	public static String chat = ChatColor.WHITE.toString();

	public static String xBorderlands = ChatColor.GOLD.toString();
	public static String xWilderness = ChatColor.YELLOW.toString();
	public static String xMid = ChatColor.WHITE.toString();
	public static String xNone = ChatColor.GRAY.toString();

	public static String space = "          ";

	public static String debug = C.yellow + C.bold + "DEBUG" + C.red + "> ";

	public static String divider = dgray + strike + "=====================================================";

	public static String logDivider = "###################################";

	public static String messagePrefix = C.blue + " * ";
	public static String broadcastPrefix = C.blue + " > ";

	public static String center(String s) {
		int le = (70 - s.length()) / 2;
		String newS = "";
		for (int i = 0; i < le; i++) {
			newS += " ";
		}
		newS += s;
		for (int i = 0; i < le; i++) {
			newS += " ";
		}
		return newS;
	}
}

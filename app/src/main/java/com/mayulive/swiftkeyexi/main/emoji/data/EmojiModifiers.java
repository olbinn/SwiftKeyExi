package com.mayulive.swiftkeyexi.main.emoji.data;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;

import com.mayulive.swiftkeyexi.ExiModule;
import com.mayulive.swiftkeyexi.util.FontLoader;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Roughy on 10/22/2017.
 */

public class EmojiModifiers
{
	public static final String NO_MODIFIER = "";
	public static final String FITZPATRICK_1_2 = "\uD83C\uDFFB";
	public static final String FITZPATRICK_3 = "\uD83C\uDFFC";
	public static final String FITZPATRICK_4= "\uD83C\uDFFD";
	public static final String FITZPATRICK_5 = "\uD83C\uDFFE";
	public static final String FITZPATRICK_6 = "\uD83C\uDFFF";

	public static final String[] FITZPATRICK_MODIFIERS = new String[]
			{
					NO_MODIFIER, FITZPATRICK_1_2, FITZPATRICK_3, FITZPATRICK_4, FITZPATRICK_5, FITZPATRICK_6
			};

	private static String LOGTAG = ExiModule.getLogTag(EmojiModifiers.class);



	//Basically a copy of the smiley panel emoji in FancyEmojiPanelTemplates.
	//We could filter them further, but it's easier to just keep a single list.
	private static final String[] MODIFIER_CANDIDATES = {"\ud83d\ude00","\ud83d\ude01","\ud83d\ude02","\ud83e\udd23","\ud83d\ude03","\ud83d\ude04","\ud83d\ude05","\ud83d\ude06","\ud83d\ude09","\ud83d\ude0a","\ud83d\ude0b","\ud83d\ude0e","\ud83d\ude0d","\ud83d\ude18","\ud83d\ude17","\ud83d\ude19","\ud83d\ude1a","\u263a","\ud83d\ude42","\ud83e\udd17","\ud83e\udd29","\ud83e\udd14","\ud83e\udd28","\ud83d\ude10","\ud83d\ude11","\ud83d\ude36","\ud83d\ude44","\ud83d\ude0f","\ud83d\ude23","\ud83d\ude25","\ud83d\ude2e","\ud83e\udd10","\ud83d\ude2f","\ud83d\ude2a","\ud83d\ude2b","\ud83d\ude34","\ud83d\ude0c","\ud83d\ude1b","\ud83d\ude1c","\ud83d\ude1d","\ud83e\udd24","\ud83d\ude12","\ud83d\ude13","\ud83d\ude14","\ud83d\ude15","\ud83d\ude43","\ud83e\udd11","\ud83d\ude32","\u2639","\ud83d\ude41","\ud83d\ude16","\ud83d\ude1e","\ud83d\ude1f","\ud83d\ude24","\ud83d\ude22","\ud83d\ude2d","\ud83d\ude26","\ud83d\ude27","\ud83d\ude28","\ud83d\ude29","\ud83e\udd2f","\ud83d\ude2c","\ud83d\ude30","\ud83d\ude31","\ud83d\ude33","\ud83e\udd2a","\ud83d\ude35","\ud83d\ude21","\ud83d\ude20","\ud83e\udd2c","\ud83d\ude37","\ud83e\udd12","\ud83e\udd15","\ud83e\udd22","\ud83e\udd2e","\ud83e\udd27","\ud83d\ude07","\ud83e\udd20","\ud83e\udd21","\ud83e\udd25","\ud83e\udd2b","\ud83e\udd2d","\ud83e\uddd0","\ud83e\udd13","\ud83d\ude08","\ud83d\udc7f","\ud83d\udc79","\ud83d\udc7a","\ud83d\udc80","\u2620","\ud83d\udc7b","\ud83d\udc7d","\ud83d\udc7e","\ud83e\udd16","\ud83d\udca9","\ud83d\ude3a","\ud83d\ude38","\ud83d\ude39","\ud83d\ude3b","\ud83d\ude3c","\ud83d\ude3d","\ud83d\ude40","\ud83d\ude3f","\ud83d\ude3e","\ud83d\ude48","\ud83d\ude49","\ud83d\ude4a","\ud83d\udc76","\ud83e\uddd2","\ud83d\udc66","\ud83d\udc67","\ud83e\uddd1","\ud83d\udc68","\ud83d\udc69","\ud83e\uddd3","\ud83d\udc74","\ud83d\udc75","\ud83d\udc68\u200d\u2695\ufe0f","\ud83d\udc69\u200d\u2695\ufe0f","\ud83d\udc68\u200d\ud83c\udf93","\ud83d\udc69\u200d\ud83c\udf93","\ud83d\udc68\u200d\ud83c\udfeb","\ud83d\udc69\u200d\ud83c\udfeb","\ud83d\udc68\u200d\u2696\ufe0f","\ud83d\udc69\u200d\u2696\ufe0f","\ud83d\udc68\u200d\ud83c\udf3e","\ud83d\udc69\u200d\ud83c\udf3e","\ud83d\udc68\u200d\ud83c\udf73","\ud83d\udc69\u200d\ud83c\udf73","\ud83d\udc68\u200d\ud83d\udd27","\ud83d\udc69\u200d\ud83d\udd27","\ud83d\udc68\u200d\ud83c\udfed","\ud83d\udc69\u200d\ud83c\udfed","\ud83d\udc68\u200d\ud83d\udcbc","\ud83d\udc69\u200d\ud83d\udcbc","\ud83d\udc68\u200d\ud83d\udd2c","\ud83d\udc69\u200d\ud83d\udd2c","\ud83d\udc68\u200d\ud83d\udcbb","\ud83d\udc69\u200d\ud83d\udcbb","\ud83d\udc68\u200d\ud83c\udfa4","\ud83d\udc69\u200d\ud83c\udfa4","\ud83d\udc68\u200d\ud83c\udfa8","\ud83d\udc69\u200d\ud83c\udfa8","\ud83d\udc68\u200d\u2708\ufe0f","\ud83d\udc69\u200d\u2708\ufe0f","\ud83d\udc68\u200d\ud83d\ude80","\ud83d\udc69\u200d\ud83d\ude80","\ud83d\udc68\u200d\ud83d\ude92","\ud83d\udc69\u200d\ud83d\ude92","\ud83d\udc6e","\ud83d\udc6e\u200d\u2642\ufe0f","\ud83d\udc6e\u200d\u2640\ufe0f","\ud83d\udd75","\ud83d\udd75\ufe0f\u200d\u2642\ufe0f","\ud83d\udd75\ufe0f\u200d\u2640\ufe0f","\ud83d\udc82","\ud83d\udc82\u200d\u2642\ufe0f","\ud83d\udc82\u200d\u2640\ufe0f","\ud83d\udc77","\ud83d\udc77\u200d\u2642\ufe0f","\ud83d\udc77\u200d\u2640\ufe0f","\ud83e\udd34","\ud83d\udc78","\ud83d\udc73","\ud83d\udc73\u200d\u2642\ufe0f","\ud83d\udc73\u200d\u2640\ufe0f","\ud83d\udc72","\ud83e\uddd5","\ud83e\uddd4","\ud83d\udc71","\ud83d\udc71\u200d\u2642\ufe0f","\ud83d\udc71\u200d\u2640\ufe0f","\ud83e\udd35","\ud83d\udc70","\ud83e\udd30","\ud83e\udd31","\ud83d\udc7c","\ud83c\udf85","\ud83e\udd36","\ud83e\uddd9","\ud83e\uddd9\u200d\u2640\ufe0f","\ud83e\uddd9\u200d\u2642\ufe0f","\ud83e\uddda","\ud83e\uddda\u200d\u2640\ufe0f","\ud83e\uddda\u200d\u2642\ufe0f","\ud83e\udddb","\ud83e\udddb\u200d\u2640\ufe0f","\ud83e\udddb\u200d\u2642\ufe0f","\ud83e\udddc","\ud83e\udddc\u200d\u2640\ufe0f","\ud83e\udddc\u200d\u2642\ufe0f","\ud83e\udddd","\ud83e\udddd\u200d\u2640\ufe0f","\ud83e\udddd\u200d\u2642\ufe0f","\ud83e\uddde","\ud83e\uddde\u200d\u2640\ufe0f","\ud83e\uddde\u200d\u2642\ufe0f","\ud83e\udddf","\ud83e\udddf\u200d\u2640\ufe0f","\ud83e\udddf\u200d\u2642\ufe0f","\ud83d\ude4d","\ud83d\ude4d\u200d\u2642\ufe0f","\ud83d\ude4d\u200d\u2640\ufe0f","\ud83d\ude4e","\ud83d\ude4e\u200d\u2642\ufe0f","\ud83d\ude4e\u200d\u2640\ufe0f","\ud83d\ude45","\ud83d\ude45\u200d\u2642\ufe0f","\ud83d\ude45\u200d\u2640\ufe0f","\ud83d\ude46","\ud83d\ude46\u200d\u2642\ufe0f","\ud83d\ude46\u200d\u2640\ufe0f","\ud83d\udc81","\ud83d\udc81\u200d\u2642\ufe0f","\ud83d\udc81\u200d\u2640\ufe0f","\ud83d\ude4b","\ud83d\ude4b\u200d\u2642\ufe0f","\ud83d\ude4b\u200d\u2640\ufe0f","\ud83d\ude47","\ud83d\ude47\u200d\u2642\ufe0f","\ud83d\ude47\u200d\u2640\ufe0f","\ud83e\udd26","\ud83e\udd26\u200d\u2642\ufe0f","\ud83e\udd26\u200d\u2640\ufe0f","\ud83e\udd37","\ud83e\udd37\u200d\u2642\ufe0f","\ud83e\udd37\u200d\u2640\ufe0f","\ud83d\udc86","\ud83d\udc86\u200d\u2642\ufe0f","\ud83d\udc86\u200d\u2640\ufe0f","\ud83d\udc87","\ud83d\udc87\u200d\u2642\ufe0f","\ud83d\udc87\u200d\u2640\ufe0f","\ud83d\udeb6","\ud83d\udeb6\u200d\u2642\ufe0f","\ud83d\udeb6\u200d\u2640\ufe0f","\ud83c\udfc3","\ud83c\udfc3\u200d\u2642\ufe0f","\ud83c\udfc3\u200d\u2640\ufe0f","\ud83d\udc83","\ud83d\udd7a","\ud83d\udc6f","\ud83d\udc6f\u200d\u2642\ufe0f","\ud83d\udc6f\u200d\u2640\ufe0f","\ud83e\uddd6","\ud83e\uddd6\u200d\u2640\ufe0f","\ud83e\uddd6\u200d\u2642\ufe0f","\ud83e\uddd7","\ud83e\uddd7\u200d\u2640\ufe0f","\ud83e\uddd7\u200d\u2642\ufe0f","\ud83e\uddd8","\ud83e\uddd8\u200d\u2640\ufe0f","\ud83e\uddd8\u200d\u2642\ufe0f","\ud83d\udec0","\ud83d\udecc","\ud83d\udd74","\ud83d\udde3","\ud83d\udc64","\ud83d\udc65","\ud83e\udd3a","\ud83c\udfc7","\u26f7","\ud83c\udfc2","\ud83c\udfcc","\ud83c\udfcc\ufe0f\u200d\u2642\ufe0f","\ud83c\udfcc\ufe0f\u200d\u2640\ufe0f","\ud83c\udfc4","\ud83c\udfc4\u200d\u2642\ufe0f","\ud83c\udfc4\u200d\u2640\ufe0f","\ud83d\udea3","\ud83d\udea3\u200d\u2642\ufe0f","\ud83d\udea3\u200d\u2640\ufe0f","\ud83c\udfca","\ud83c\udfca\u200d\u2642\ufe0f","\ud83c\udfca\u200d\u2640\ufe0f","\u26f9","\u26f9\ufe0f\u200d\u2642\ufe0f","\u26f9\ufe0f\u200d\u2640\ufe0f","\ud83c\udfcb","\ud83c\udfcb\ufe0f\u200d\u2642\ufe0f","\ud83c\udfcb\ufe0f\u200d\u2640\ufe0f","\ud83d\udeb4","\ud83d\udeb4\u200d\u2642\ufe0f","\ud83d\udeb4\u200d\u2640\ufe0f","\ud83d\udeb5","\ud83d\udeb5\u200d\u2642\ufe0f","\ud83d\udeb5\u200d\u2640\ufe0f","\ud83c\udfce","\ud83c\udfcd","\ud83e\udd38","\ud83e\udd38\u200d\u2642\ufe0f","\ud83e\udd38\u200d\u2640\ufe0f","\ud83e\udd3c","\ud83e\udd3c\u200d\u2642\ufe0f","\ud83e\udd3c\u200d\u2640\ufe0f","\ud83e\udd3d","\ud83e\udd3d\u200d\u2642\ufe0f","\ud83e\udd3d\u200d\u2640\ufe0f","\ud83e\udd3e","\ud83e\udd3e\u200d\u2642\ufe0f","\ud83e\udd3e\u200d\u2640\ufe0f","\ud83e\udd39","\ud83e\udd39\u200d\u2642\ufe0f","\ud83e\udd39\u200d\u2640\ufe0f","\ud83d\udc6b","\ud83d\udc6c","\ud83d\udc6d","\ud83d\udc8f","\ud83d\udc69\u200d\u2764\ufe0f\u200d\ud83d\udc8b\u200d\ud83d\udc68","\ud83d\udc68\u200d\u2764\ufe0f\u200d\ud83d\udc8b\u200d\ud83d\udc68","\ud83d\udc69\u200d\u2764\ufe0f\u200d\ud83d\udc8b\u200d\ud83d\udc69","\ud83d\udc91","\ud83d\udc69\u200d\u2764\ufe0f\u200d\ud83d\udc68","\ud83d\udc68\u200d\u2764\ufe0f\u200d\ud83d\udc68","\ud83d\udc69\u200d\u2764\ufe0f\u200d\ud83d\udc69","\ud83d\udc6a","\ud83d\udc68\u200d\ud83d\udc69\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc69\u200d\ud83d\udc67","\ud83d\udc68\u200d\ud83d\udc69\u200d\ud83d\udc67\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc69\u200d\ud83d\udc66\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc69\u200d\ud83d\udc67\u200d\ud83d\udc67","\ud83d\udc68\u200d\ud83d\udc68\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc68\u200d\ud83d\udc67","\ud83d\udc68\u200d\ud83d\udc68\u200d\ud83d\udc67\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc68\u200d\ud83d\udc66\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc68\u200d\ud83d\udc67\u200d\ud83d\udc67","\ud83d\udc69\u200d\ud83d\udc69\u200d\ud83d\udc66","\ud83d\udc69\u200d\ud83d\udc69\u200d\ud83d\udc67","\ud83d\udc69\u200d\ud83d\udc69\u200d\ud83d\udc67\u200d\ud83d\udc66","\ud83d\udc69\u200d\ud83d\udc69\u200d\ud83d\udc66\u200d\ud83d\udc66","\ud83d\udc69\u200d\ud83d\udc69\u200d\ud83d\udc67\u200d\ud83d\udc67","\ud83d\udc68\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc66\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc67","\ud83d\udc68\u200d\ud83d\udc67\u200d\ud83d\udc66","\ud83d\udc68\u200d\ud83d\udc67\u200d\ud83d\udc67","\ud83d\udc69\u200d\ud83d\udc66","\ud83d\udc69\u200d\ud83d\udc66\u200d\ud83d\udc66","\ud83d\udc69\u200d\ud83d\udc67","\ud83d\udc69\u200d\ud83d\udc67\u200d\ud83d\udc66","\ud83d\udc69\u200d\ud83d\udc67\u200d\ud83d\udc67","\ud83e\udd33","\ud83d\udcaa","\ud83d\udc48","\ud83d\udc49","\u261d","\ud83d\udc46","\ud83d\udd95","\ud83d\udc47","\u270c","\ud83e\udd1e","\ud83d\udd96","\ud83e\udd18","\ud83e\udd19","\ud83d\udd90","\u270b","\ud83d\udc4c","\ud83d\udc4d","\ud83d\udc4e","\u270a","\ud83d\udc4a","\ud83e\udd1b","\ud83e\udd1c","\ud83e\udd1a","\ud83d\udc4b","\ud83e\udd1f","\u270d","\ud83d\udc4f","\ud83d\udc50","\ud83d\ude4c","\ud83e\udd32","\ud83d\ude4f","\ud83e\udd1d","\ud83d\udc85","\ud83d\udc42","\ud83d\udc43","\ud83d\udc63","\ud83d\udc40","\ud83d\udc41","\ud83d\udc41\ufe0f\u200d\ud83d\udde8\ufe0f","\ud83e\udde0","\ud83d\udc45","\ud83d\udc44","\ud83d\udc8b","\ud83d\udc98","\u2764","\ud83d\udc93","\ud83d\udc94","\ud83d\udc95","\ud83d\udc96","\ud83d\udc97","\ud83d\udc99","\ud83d\udc9a","\ud83d\udc9b","\ud83e\udde1","\ud83d\udc9c","\ud83d\udda4","\ud83d\udc9d","\ud83d\udc9e","\ud83d\udc9f","\u2763","\ud83d\udc8c","\ud83d\udca4","\ud83d\udca2","\ud83d\udca3","\ud83d\udca5","\ud83d\udca6","\ud83d\udca8","\ud83d\udcab","\ud83d\udcac","\ud83d\udde8","\ud83d\uddef","\ud83d\udcad","\ud83d\udd73","\ud83d\udc53","\ud83d\udd76","\ud83d\udc54","\ud83d\udc55","\ud83d\udc56","\ud83e\udde3","\ud83e\udde4","\ud83e\udde5","\ud83e\udde6","\ud83d\udc57","\ud83d\udc58","\ud83d\udc59","\ud83d\udc5a","\ud83d\udc5b","\ud83d\udc5c","\ud83d\udc5d","\ud83d\udecd","\ud83c\udf92","\ud83d\udc5e","\ud83d\udc5f","\ud83d\udc60","\ud83d\udc61","\ud83d\udc62","\ud83d\udc51","\ud83d\udc52","\ud83c\udfa9","\ud83c\udf93","\ud83e\udde2","\u26d1","\ud83d\udcff","\ud83d\udc84","\ud83d\udc8d","\ud83d\udc8e","\ud83d\udc35"};

	private static Paint mPaint = new Paint();



	//List of base emoji that support modifiers
	private static Set<String> mModifiableEmoji = new HashSet<String>();

	static
	{
		resolveModifableEmoji();
	}

	public static void forceInit()
	{
		Log.i(LOGTAG, "I am a teapot");
	}

	public static boolean singleSupportsModifiers(String emoji)
	{
		return mModifiableEmoji.contains(emoji);
	}

	private static void resolveModifableEmoji()
	{
		//Single emoji that take a modifier are simple, just plonk the modifier after it.
		//When said emoji is combined with other emoji things get complicated, as the modifier
		//must come directly /after/ the emoji to be modified.
		//and then with family emoji we have multiple of these in the same single emoji.

		//First step, assume that all other fancy emoji will be a combination of another existing single emoji,
		//go through all the smiley emoji that are a single character (no combinations or variants), and see if they
		//take a modifier.
		for (String string : MODIFIER_CANDIDATES)
		{
			String singleEmoji = stripModifableEmoji(string);
			if (singleEmoji != null)
			{
				mModifiableEmoji.add(singleEmoji);
			}
		}
	}

	//Strip the first emoji character from the string if it supports modifiers, otherwise null
	private static String stripModifableEmoji(String text)
	{
		//Empty strings will never support anything
		if (text.isEmpty())
		{
			return null;
		}

		//We consider the whole string, meaning we are only interested in base emoji here.
		String singleEmoji;
		if (Character.isSurrogate( text.charAt(0) ))
			singleEmoji = text.substring(0,2);
		else
			singleEmoji = text.substring(0,1);


		Rect bounds = new Rect();
		Rect originalBounds = new Rect();

		//Throw a modifier at the first character in the string.
		//The modifier should go directly AFTER the colorable-emoji bit.
		//If the width remains the same with or without the mofidier we're good.
		String withModifier = singleEmoji + FITZPATRICK_1_2;
		mPaint.getTextBounds(withModifier,0,withModifier.length(), bounds);
		mPaint.getTextBounds(text, 0, text.length(), originalBounds);

		if (bounds.width() == originalBounds.width())
		{
			return singleEmoji;
		}
		else
			return null;
	}

	public static String applyModifier(String text, String modifier)
	{
		if (modifier.isEmpty())
			return text;


		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < text.length(); i++)
		{
			int stride = 1;
			if (Character.isHighSurrogate( text.charAt(i) ))
			{
				stride = 2;
			}

			String current = text.substring(i,i+stride);

			builder.append(current);

			if (singleSupportsModifiers(current))
			{
				builder.append(modifier);
			}

			//Skip extra if surrogate
			i += stride - 1;
		}

		return builder.toString();
	}

	public static boolean supportsModifiers(String text)
	{
		//Just apply the modifier to all single emoji we know support them
		//and see what happens
		String modifiedString = EmojiModifiers.applyModifier(text,FITZPATRICK_1_2);

		//If no modifiers were added, there were not emoji that take modifiers
		if (modifiedString.equals(text))
			return false;
		if (FontLoader.isSingleChar(modifiedString))
		{
			return true;
		}

		return false;
	}


}

package com.mayulive.swiftkeyexi.xposed.style;

import com.mayulive.xposed.classhunter.profiles.ClassItem;
import com.mayulive.xposed.classhunter.profiles.ClassProfile;
import com.mayulive.xposed.classhunter.profiles.ConstructorProfile;
import com.mayulive.xposed.classhunter.profiles.FieldItem;
import com.mayulive.xposed.classhunter.profiles.MethodProfile;

import static com.mayulive.xposed.classhunter.Modifiers.*;

public class StyleProfiles
{

	public static ClassProfile get_DRAWABLE_LOADER_CLASS_PROFILE()
	{
		ClassProfile newProfile = new ClassProfile();

		newProfile.setFullPath("ics");
		newProfile.setKnownPath("");

		newProfile.setMinDepth(0);
		newProfile.setMaxDepth(0);
		newProfile.setModifiers(PUBLIC | FINAL );

		newProfile.setTypeParamCount(0);
		newProfile.setSuperClass(	new ClassItem(java.lang.Object.class));
/////////////////////////
//Interfaces
/////////////////////////
		newProfile.setInterfaces(new ClassItem[]
				{
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

				});
/////////////////////////
//Nested Classes
/////////////////////////
		newProfile.setNestedClasses(new ClassItem[]
				{
						new ClassItem("" , STATIC | INTERFACE | ABSTRACT | EXACT )

				});
/////////////////////////
//Declared fields
/////////////////////////
		newProfile.setDeclaredFields(new FieldItem[]
				{
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//a
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//b
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(java.util.Map.class)),	//c
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(java.util.Map.class)),	//d
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | ABSTRACT | EXACT )),	//e

				});
/////////////////////////
//Declared Methods
/////////////////////////
		newProfile.setDeclaredMethods(new MethodProfile[]
				{
						//Method #0: a
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem(java.lang.Object.class),
										new ClassItem("" , STATIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #1: b
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem(java.lang.Object.class),
										new ClassItem("" , STATIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #2: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(float.class),

										new ClassItem(double.class)

								),

						//Method #3: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(int.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #4: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.RectF.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #5: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #6: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #7: a
						new MethodProfile
								(
										FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #8: a
						new MethodProfile
								(
										FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #9: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #10: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #11: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #12: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #13: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.text.TextPaint.class),

										new ClassItem(java.lang.String.class)

								),

						//Method #14: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(java.lang.Integer.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #15: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #16: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #17: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.graphics.drawable.Drawable.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),


				});
/////////////////////////
//Declared Constructors
/////////////////////////
		newProfile.setDeclaredConstructors(new ConstructorProfile[]
				{
						//Constructor #0
						new ConstructorProfile
								(		PUBLIC | EXACT ,

										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),


				});

		return newProfile;
	}

}
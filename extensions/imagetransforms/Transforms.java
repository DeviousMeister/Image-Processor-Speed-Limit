package extensions.imagetransforms;

import java.awt.Color;

import support.sedgewick.Picture;


public class Transforms {
	
	/**
	 * This one is solved for you.
	 * @param source
	 * @param target
	 */
	public static void flipHoriz(Picture source, Picture target) { 
		for (int x = 0; x < source.width(); x++) {
			for (int y = 0; y < source.height(); y++) {
				//
				// Convince yourself that otherX is the x coordinate flipped,
				//     on the other side of the image by doing the following:
				// Check that this is true when x == 0
				//      then otherX = source.width() - 1
				//      which is indeed the rightmost pixel
				// Check that this is true when x == source.width()-1
				//      then otherX = 0
				//      which is indeed the leftmost pixel
				//
				int otherX = source.width() - 1 - x;  // otherX is the mirror of x
				Color c = source.get(otherX, y);      // get the Color at the mirror point of the source
				target.set(x, y, c);                  // and set it at x,y in the target
			}
		}
	}
	
	public static void flipVert(Picture source, Picture target) {
		for (int y = 0; y < source.height(); y++){
			for (int x = 0; x < source.width(); x++){
				int otherY = source.height() - 1 - y;
				Color c2 = source.get(x, otherY);
				target.set(x, y, c2);
			}
		}
	}
	
	
	public static void flipHorizLeftHalf(Picture source, Picture target) {
		for (int x = 0; x < source.width(); x++){
			for (int y = 0; y < source.height(); y++){
				if(x<(source.width()/2)){
					Color c1 = source.get(x, y);
					target.set(x, y, c1);
				}
				else{
					int otherX = source.width() - x;
					Color c1 = source.get(otherX, y);
					target.set(x, y, c1);
				}

			}
		}
	}
	
	public static void flipVertBotHalf(Picture source, Picture target) {
		for (int y = 0; y < source.height(); y++){
			for (int x = 0; x < source.width(); x++){
				if(y<(source.height()/2)){
					Color c1 = source.get(x, y);
					target.set(x, y, c1);
				}
				else{
					int otherY = source.height()-1-y;
					Color c1 = source.get(x, otherY);
					target.set(x, y, c1);
				}
			}
		}
	}
	
	public static void gradient(Picture target) {
		for (int x = 0; x < target.width(); ++x){
			for (int y = 0; y < target.height(); ++y){
				int otherX = target.width() - 1;
				int otherY = target.height() - 1;
				int amountRed = ((x)*(255/otherX));
				int amountGreen = (int)((y)*((double) 255)/otherY);
				target.set(x, y, new Color(amountRed, amountGreen,128));
			}
		}
	}
	
	public static void edgeDetect(Picture source, Picture target) {
		// FIXME
	}
	
	public static void digitalFilter(Picture source, Picture target) {
		// FIXME	
	}



}

package clock.menu;

public class AlarmBackground {

	/**
	 * 默认的背景图片
	 */
	private static String BACKGROUND_DEFAULT="src/image/background.png";
	private static String BACKGROUND_FRUIT="src/image/background1.png";
	private static String BACKGROUND_BICK="src/image/background2.png";
	/**
	 * 背景图片的list
	 */
	private static String[] backgroundList={BACKGROUND_DEFAULT,BACKGROUND_FRUIT,BACKGROUND_BICK};
	/**
	 * 获取背景图片的list的长度
	 * @return 返回背景图片的list的长度
	 */
	public static int getBackgroundListSize(){
		return backgroundList.length;
	}
	public static String getBackground(int bg){
		return backgroundList[bg];
	}
}

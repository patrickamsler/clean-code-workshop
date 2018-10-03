package com.zuehlke.cleancodeworkshop.smellyshapes;

public class Color {

    public enum ColorName {
        RED("Red"), BLUE("Blue"), GREEN("Green");

        private final String name;

        ColorName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private String colorAsHex;
    private String colorAsText;
    private String colorAsRGB_Red;
    private String colorAsRGB_Green;
    private String colorAsRGB_Blue;
    private String errorMessage;

    public Color(ColorName colorName) {
        this(colorName.getName());
    }

    @Deprecated
    public Color(String colorAsText) {
        this.colorAsText = colorAsText;
        convertTextValueToRGBAndHex();
    }

    private void convertTextValueToRGBAndHex() {
        errorMessage = "";
        if (ColorName.RED.getName().equals(colorAsText)) {
            colorAsRGB_Red = "255";
            colorAsRGB_Blue = "0";
            colorAsRGB_Green = "0";
            colorAsHex = "#FF0000";
        } else if (ColorName.BLUE.getName().equals(colorAsText)) {
            colorAsRGB_Red = "0";
            colorAsRGB_Blue = "255";
            colorAsRGB_Green = "0";
            colorAsHex = "#00FF00";
        } else if (ColorName.GREEN.getName().equals(colorAsText)) {
            colorAsRGB_Red = "0";
            colorAsRGB_Blue = "0";
            colorAsRGB_Green = "255";
            colorAsHex = "#0000FF";
        } else {
            errorMessage = "Color not recognized";
        }
    }

    public String getBlue() {
        return colorAsRGB_Blue;
    }

    public String getGreen() {
        return colorAsRGB_Green;
    }

    public String getRed() {
        return colorAsRGB_Red;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getColorFormatted(boolean includeHexAndRGB) {
        if (includeHexAndRGB) {
            return colorAsText + " " + colorAsHex + " " + colorAsRGB_Red + ":" + colorAsRGB_Green + ":" + colorAsRGB_Blue;
        } else {
            return colorAsText;
        }
    }

    public String getColorAsHex() {
        return colorAsHex;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.werkstukcp3.samgoeman.font;

import java.awt.Font;
import java.io.InputStream;

/**
 *
 * @author SamGoeman
 */
public class GenerateFont {

    public static final String CUTIVEMONO = "CutiveMono-Regular.ttf";
    public static final String RALEWAY = "Raleway-Medium.ttf";

    public static Font getFont(String fontName, int style, int size) {
        Font font = null;
        try {
            InputStream fontStream = GenerateFont.class.getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            font = font.deriveFont(style, size);
            fontStream.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return font;
    }

    public static Font raleway12() {
        return GenerateFont.getFont(GenerateFont.RALEWAY, Font.BOLD, 12);
    }

    public static Font cutive12() {
        return GenerateFont.getFont(GenerateFont.CUTIVEMONO, Font.BOLD, 12);
    }
}

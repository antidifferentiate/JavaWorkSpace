package hip.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Draw the picture.
 * 
 * @author Jalen Morgan
 * @version 1.0
 * 
 */
public class PicturePanel extends JPanel
{
	private Image baseImage;
	private ImageIcon pictureSource;
	private int width;
	private int height;

	/**
	 * Creates a PicturePanel object witht eh specified URL path, width, and
	 * height.
	 * 
	 * @param imagePath
	 *            The URL address for the picture.
	 * @param width
	 *            The width of the panel.
	 * @param height
	 *            The height of the panel.
	 */
	public PicturePanel(URL imagePath, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.pictureSource = new ImageIcon(imagePath);
	}

	/**
	 * Overrides the paintComponent method of JPanel to draw the image to fill
	 * the entire panel.
	 */
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
	}
}

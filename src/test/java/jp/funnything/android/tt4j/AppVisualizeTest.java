package jp.funnything.android.tt4j;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import junit.framework.TestCase;
import android.view.animation.Interpolator;

public class AppVisualizeTest extends TestCase {
    static class InterpolatorInfo {
        Interpolator interpolator;
        String name;

        InterpolatorInfo( final Interpolator interpolator , final String name ) {
            this.interpolator = interpolator;
            this.name = name;
        }
    }

    static final int CHART_WIDTH = 256;
    static final int CHART_HEIGHT = 256;
    static final int H_PADDING = 32;
    static final int PADDING_TOP = 32;
    static final int PADDING_BOTTOM = 64;

    private List< InterpolatorInfo > buildList() {
        final List< InterpolatorInfo > ret = new ArrayList< InterpolatorInfo >();

        ret.add( new InterpolatorInfo( new EaseInSineInterpolator() , "EaseInSine" ) );
        ret.add( new InterpolatorInfo( new EaseOutSineInterpolator() , "EaseOutSine" ) );
        ret.add( new InterpolatorInfo( new EaseInOutSineInterpolator() , "EaseInOutSine" ) );
        ret.add( new InterpolatorInfo( new EaseOutInSineInterpolator() , "EaseOutInSine" ) );

        ret.add( new InterpolatorInfo( new EaseInQuadInterpolator() , "EaseInQuad" ) );
        ret.add( new InterpolatorInfo( new EaseOutQuadInterpolator() , "EaseOutQuad" ) );
        ret.add( new InterpolatorInfo( new EaseInOutQuadInterpolator() , "EaseInOutQuad" ) );
        ret.add( new InterpolatorInfo( new EaseOutInQuadInterpolator() , "EaseOutInQuad" ) );

        ret.add( new InterpolatorInfo( new EaseInCubicInterpolator() , "EaseInCubic" ) );
        ret.add( new InterpolatorInfo( new EaseOutCubicInterpolator() , "EaseOutCubic" ) );
        ret.add( new InterpolatorInfo( new EaseInOutCubicInterpolator() , "EaseInOutCubic" ) );
        ret.add( new InterpolatorInfo( new EaseOutInCubicInterpolator() , "EaseOutInCubic" ) );

        ret.add( new InterpolatorInfo( new EaseInQuartInterpolator() , "EaseInQuart" ) );
        ret.add( new InterpolatorInfo( new EaseOutQuartInterpolator() , "EaseOutQuart" ) );
        ret.add( new InterpolatorInfo( new EaseInOutQuartInterpolator() , "EaseInOutQuart" ) );
        ret.add( new InterpolatorInfo( new EaseOutInQuartInterpolator() , "EaseOutInQuart" ) );

        ret.add( new InterpolatorInfo( new EaseInQuintInterpolator() , "EaseInQuint" ) );
        ret.add( new InterpolatorInfo( new EaseOutQuintInterpolator() , "EaseOutQuint" ) );
        ret.add( new InterpolatorInfo( new EaseInOutQuintInterpolator() , "EaseInOutQuint" ) );
        ret.add( new InterpolatorInfo( new EaseOutInQuintInterpolator() , "EaseOutInQuint" ) );

        ret.add( new InterpolatorInfo( new EaseInExpoInterpolator() , "EaseInExpo" ) );
        ret.add( new InterpolatorInfo( new EaseOutExpoInterpolator() , "EaseOutExpo" ) );
        ret.add( new InterpolatorInfo( new EaseInOutExpoInterpolator() , "EaseInOutExpo" ) );
        ret.add( new InterpolatorInfo( new EaseOutInExpoInterpolator() , "EaseOutInExpo" ) );

        ret.add( new InterpolatorInfo( new EaseInCircInterpolator() , "EaseInCirc" ) );
        ret.add( new InterpolatorInfo( new EaseOutCircInterpolator() , "EaseOutCirc" ) );
        ret.add( new InterpolatorInfo( new EaseInOutCircInterpolator() , "EaseInOutCirc" ) );
        ret.add( new InterpolatorInfo( new EaseOutInCircInterpolator() , "EaseOutInCirc" ) );

        ret.add( new InterpolatorInfo( new EaseInElasticInterpolator() , "EaseInElastic" ) );
        ret.add( new InterpolatorInfo( new EaseOutElasticInterpolator() , "EaseOutElastic" ) );
        ret.add( new InterpolatorInfo( new EaseInOutElasticInterpolator() , "EaseInOutElastic" ) );
        ret.add( new InterpolatorInfo( new EaseOutInElasticInterpolator() , "EaseOutInElastic" ) );

        ret.add( new InterpolatorInfo( new EaseInBackInterpolator() , "EaseInBack" ) );
        ret.add( new InterpolatorInfo( new EaseOutBackInterpolator() , "EaseOutBack" ) );
        ret.add( new InterpolatorInfo( new EaseInOutBackInterpolator() , "EaseInOutBack" ) );
        ret.add( new InterpolatorInfo( new EaseOutInBackInterpolator() , "EaseOutInBack" ) );

        ret.add( new InterpolatorInfo( new EaseInBounceInterpolator() , "EaseInBounce" ) );
        ret.add( new InterpolatorInfo( new EaseOutBounceInterpolator() , "EaseOutBounce" ) );
        ret.add( new InterpolatorInfo( new EaseInOutBounceInterpolator() , "EaseInOutBounce" ) );
        ret.add( new InterpolatorInfo( new EaseOutInBounceInterpolator() , "EaseOutInBounce" ) );

        return ret;
    }

    private int calc( final Interpolator i , final int x ) {
        return Math.round( i.getInterpolation( 1f * x / CHART_WIDTH ) * CHART_HEIGHT );
    }

    private RenderedImage createImage( final Interpolator i , final String name ) {
        final int w = CHART_WIDTH + H_PADDING * 2;
        final int h = CHART_HEIGHT + PADDING_TOP + PADDING_BOTTOM;

        final BufferedImage ret = new BufferedImage( w , h , BufferedImage.TYPE_INT_ARGB );

        final Graphics2D g = ret.createGraphics();

        g.setRenderingHint( RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON );

        g.setColor( Color.WHITE );
        g.fillRect( 0 , 0 , w , h );

        drawName( g , name );

        drawFrame( g );

        drawChart( i , h , g );

        return ret;
    }

    private void drawChart( final Interpolator i , final int h , final Graphics2D g ) {
        g.setColor( Color.RED );

        for ( int x = 0 ; x < CHART_WIDTH - 1 ; x++ ) {
            g.drawLine( x + H_PADDING , h - PADDING_BOTTOM - 1 - calc( i , x ) , x + 1 + H_PADDING , h - PADDING_BOTTOM - 1 - calc( i , x + 1 ) );
        }
    }

    private void drawFrame( final Graphics2D g ) {
        g.setColor( Color.BLACK );

        g.drawRect( H_PADDING , PADDING_TOP , CHART_WIDTH , CHART_HEIGHT );
    }

    private void drawName( final Graphics2D g , final String name ) {
        g.setColor( Color.BLACK );

        final int w = g.getFontMetrics().stringWidth( name );
        final int h = g.getFontMetrics().getHeight();

        g.drawString( name , ( CHART_WIDTH + H_PADDING * 2 - w ) / 2f , PADDING_TOP + CHART_HEIGHT + ( PADDING_BOTTOM - h ) / 2f + h );
    }

    public void testVisualize() {
        try {
            final List< InterpolatorInfo > infos = buildList();

            final int w = CHART_WIDTH + H_PADDING * 2;
            final int h = CHART_HEIGHT + PADDING_TOP + PADDING_BOTTOM;

            final BufferedImage image = new BufferedImage( w * 4 , h * ( infos.size() / 4 ) , BufferedImage.TYPE_INT_ARGB );

            final Graphics2D g = image.createGraphics();

            for ( int index = 0 ; index < infos.size() ; index++ ) {
                g.drawImage( ( Image ) createImage( infos.get( index ).interpolator , infos.get( index ).name ) , w * ( index % 4 ) , h
                        * ( index / 4 ) , null );
            }

            // target... mmm...
            ImageIO.write( image , "png" , new File( "target/out.png" ) );
        } catch ( final IOException e ) {
            throw new RuntimeException( e );
        }
    }
}

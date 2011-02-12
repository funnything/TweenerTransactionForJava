package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInElasticInterpolator implements Interpolator {
    private final float _amplitude;
    private final float _period;

    public EaseInElasticInterpolator() {
        _amplitude = 1;
        _period = 0.3f;
    }

    public EaseInElasticInterpolator( final float amplitude , final float period ) {
        _amplitude = amplitude;
        _period = period;
    }

    @Override
    public float getInterpolation( final float input ) {
        return ( float ) -( _amplitude * Math.pow( 2 , 10 * ( input - 1 ) ) * Math.sin( ( input - 1 ) * 2 * Math.PI / _period
                - Math.asin( 1 / _amplitude ) ) );
    }
}

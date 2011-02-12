package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public abstract class Reverser implements Interpolator {
    private Interpolator _source = null;

    @Override
    public final float getInterpolation( final float input ) {
        if ( _source == null ) {
            _source = getSourceInterpolator();
        }

        return 1 - _source.getInterpolation( 1 - input );
    }

    protected abstract Interpolator getSourceInterpolator();
}

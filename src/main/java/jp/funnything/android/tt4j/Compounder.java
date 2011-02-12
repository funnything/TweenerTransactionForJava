package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public abstract class Compounder implements Interpolator {
    private Interpolator _first;
    private Interpolator _last;

    protected abstract Interpolator getFirstHalfInterpolator();

    @Override
    public final float getInterpolation( final float input ) {
        if ( _first == null ) {
            _first = getFirstHalfInterpolator();
        }

        if ( _last == null ) {
            _last = getLastHalfInterpolator();
        }

        final float doubled = input * 2;

        return ( doubled < 1 ? _first.getInterpolation( doubled ) : _last.getInterpolation( doubled - 1 ) + 1 ) / 2;
    }

    protected abstract Interpolator getLastHalfInterpolator();
}

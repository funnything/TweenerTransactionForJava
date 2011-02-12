package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInQuintInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutQuintInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInQuintInterpolator();
    }
}

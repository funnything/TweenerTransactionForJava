package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseInOutQuintInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseInQuintInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseOutQuintInterpolator();
    }
}

package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInCubicInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutCubicInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInCubicInterpolator();
    }
}

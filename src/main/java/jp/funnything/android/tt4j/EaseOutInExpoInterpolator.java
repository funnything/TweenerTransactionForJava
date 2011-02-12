package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInExpoInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutExpoInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInExpoInterpolator();
    }
}

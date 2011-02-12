package jp.funnything.android.tt4j;

import android.view.animation.Interpolator;

public class EaseOutInBounceInterpolator extends Compounder {
    @Override
    protected Interpolator getFirstHalfInterpolator() {
        return new EaseOutBounceInterpolator();
    }

    @Override
    protected Interpolator getLastHalfInterpolator() {
        return new EaseInBounceInterpolator();
    }
}

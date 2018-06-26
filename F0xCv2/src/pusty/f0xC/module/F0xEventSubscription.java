package pusty.f0xC.module;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import pusty.f0xC.module.F0xEvent.F0xEventPriority;
import pusty.f0xC.module.F0xEvent.F0xEventType;

@Retention(RetentionPolicy.RUNTIME)
public @interface F0xEventSubscription {
	F0xEventType event();
	F0xEventPriority priority() default F0xEventPriority.NORMAL;
}

package utils;

import play.i18n.Messages;
import play.libs.typedmap.TypedKey;

public class Attrs {
    public static final TypedKey<Messages> MESSAGES = TypedKey.create("messages");
    public static final TypedKey<Integer> MAX_ROWS = TypedKey.create("max_rows");
}

import java.util.stream.Stream
import kotlin.streams.toList

val x = 35
generateSequence(2){it + 1}
    .dropWhile { it * it <= x }
    .first()-1
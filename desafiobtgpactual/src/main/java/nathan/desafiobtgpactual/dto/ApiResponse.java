package nathan.desafiobtgpactual.dto;

import java.util.Map;
import java.util.List;

public record ApiResponse<T>(Map<String, Object> summary,
                             List<T> data,
                             PaginationResponse paginationResponse) {
}

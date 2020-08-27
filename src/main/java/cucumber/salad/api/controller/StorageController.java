package cucumber.salad.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cucumber.salad.api.service.DummyService;

@ResponseBody
@RestController
@RequestMapping("/api/salad")
public class StorageController {
	
	@Autowired
	private DummyService service;

	@GetMapping
	public ResponseEntity<String> testOne(@RequestParam(name = "name", required = false) String name) {
		return ResponseEntity.ok(service.hello(name));
	}

	@PostMapping
	public ResponseEntity<String> testTwo(@RequestBody String body) {
		return ResponseEntity.ok(service.whatsup(body));
	}
}
